package com.dktechin.theater;

/**
 * 극장 클래스
 */
class Theater {
    private final TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        this.ticketSeller.sellTo(audience);
    }

}
