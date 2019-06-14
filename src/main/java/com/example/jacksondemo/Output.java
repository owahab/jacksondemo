package com.example.jacksondemo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Output {
    private List<Kollection> data;
}
