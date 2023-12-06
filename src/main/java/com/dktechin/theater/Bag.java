package com.dktechin.theater;

/**
 * 관람객의 가방 정보 클래스
 */
class Bag {

    /**
     * 관람객이 소유한 돈
     */
    private Long amount;
    /**
     * 무료 관람 가능한 초대권 정보
     */
    private Invitation invitation;
    /**
     * 관람하기위한 티켓 정보
     */
    private Ticket ticket;

    /**
     * 이벤트에 딩첨되지 않은 관람객의 가방 안에는 초대장이 들어있지 않을 것
     * @param amount 금액
     */
    public Bag(Long amount) {
        this(amount, null);
    }

    /**
     * 이벤트에 당첨된 관람객의 가방 안에는 현굼과 초대장이 들어있음
     * @param amount 금액
     * @param invitation 초대권
     */
    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    /**
     * @return 초대권을 가지고 있는지 여부
     */
    public boolean hasInvitation() {
        return this.invitation != null;
    }

    /**
     * @return 티켓을 가지고있는지 여부
     */
    public boolean hasTicket() {
        return this.ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
