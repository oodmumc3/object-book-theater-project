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

    public Bag getBag() {
        return bag;
    }
}
