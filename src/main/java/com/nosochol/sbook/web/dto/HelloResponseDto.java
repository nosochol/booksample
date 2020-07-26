package com.nosochol.sbook.web.dto;

import lombok.*;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

/*
    public HelloResponseDto(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }


    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "HelloResponseDto{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
*/

    @Builder
    public HelloResponseDto(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    private String name;
    private int amount;
}
