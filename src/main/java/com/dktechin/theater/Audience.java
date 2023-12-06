package com.dktechin.theater;

/**
 * 관람객 정보 클래스
 */
class Audience {
    /**
     * 관람객이 가지고있는 가방 정보
     */
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        this.bag.setTicket(ticket);

        // 초대권이 있을시
        if (this.bag.hasInvitation()) {
            return 0L;
        }

        // 초대권이 없을시 금액 차감 후 티켓 전달
        this.bag.minusAmount(ticket.getFee());
        return ticket.getFee();
    }
}
