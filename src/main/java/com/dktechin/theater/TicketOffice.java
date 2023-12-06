package com.dktechin.theater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 티켓 매표소 클래스
 */
class TicketOffice {
    /**
     * 매표소 판매 금액
     */
    private Long amount;
    /**
     * 판매할 티켓 리스트 정보
     */
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    /**
     * 티켓 판매 메서드
     * 편의상 티켓 목록의 맨앞 티켓을 반환해준다.
     * @return 판매할 티켓 정보
     */
    public Ticket getTicket() {
        return this.tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
