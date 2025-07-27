package com.JutlandAir.JutlandAir.plane.model;

import lombok.Getter;

@Getter
public enum Model {
    Embraer_E195_E2("E295"),
    EmbraerE190E2("E290"),
    AirbusA32O200("A320"),
    AirbusA330900("A339"),
    Boeing777300ER("B77W");

    private final String ICAOCode;

    Model(String ICAOCode){
        this.ICAOCode = ICAOCode;
    }

}
