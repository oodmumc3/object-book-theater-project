package com.dktechin.theater;

/**
 * 극장 클래스
 */
class Theater {
    private final TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 관람객 입장시 초대권을 확인하여
     * - 초대권이 있을시: 티켓을 관람객에게 준다.
     * - 초대권 없을시: 티켓 금액만큼 관람객의 금액을 차감후 티켓을 전달한다.
     *
     * @param audience 관람객 정보
     */
    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            // 초대권이 있을시 티켓을 전달
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            // 초대권이 없을시 금액 차감 후 티켓 전달
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();

            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());

            audience.getBag().setTicket(ticket);
        }
    }

}