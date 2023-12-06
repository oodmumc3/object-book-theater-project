package com.dktechin.theater;

/**
 * 매표소 직원 클래스
 */
class TicketSeller {
    /**
     * 매표소 직원은 자신이 일하는 매표소를 알고 있어야 함.
     */
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        Ticket ticket = this.ticketOffice.getTicket();
        this.ticketOffice.minusAmount(audience.buy(ticket));
    }
}
