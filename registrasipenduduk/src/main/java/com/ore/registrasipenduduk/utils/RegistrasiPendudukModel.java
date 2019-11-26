package com.ore.registrasipenduduk.utils;

public class RegistrasiPendudukModel {

    private static DataModel registrasiPenduduk;

    public static DataModel getRegistrasiPenduduk() {
        return registrasiPenduduk;
    }

    public static void setRegistrasiPenduduk(DataModel registrasiPenduduk) {
        RegistrasiPendudukModel.registrasiPenduduk = registrasiPenduduk;
    }
}
