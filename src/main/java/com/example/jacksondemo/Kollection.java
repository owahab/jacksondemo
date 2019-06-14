package com.example.jacksondemo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Kollection {
    private String collectionDeposit;
    private String collectionAmount;
}
