package com.kagome.osiwali_lol.bean;

/**
 * Created  on 2021/5/20 15:17
 *
 * @author: Osiwali
 */
public enum RegionShard {
    UNKNOWN(new String[]{"", ""}),
    AMERICAS(new String[]{"AMERICAS", "americas"}),
    EUROPE(new String[]{"EUROPE", "europe"}),
    ASIA(new String[]{"ASIA", "asia"}),
    GARENA(new String[]{"GARENA", "garena"}),
    PBE(new String[]{"PBE", "pbe"}),
    ESPORTS(new String[]{"ESPORTS", "esports"});

    private String[] key;

    private RegionShard(String... s) {
        this.key = s;
    }


    public String getValue() {
        return this.key[0];
    }

    public String getRealmValue() {
        return this.key[1];
    }

    public String toString() {
        return this.getValue();
    }
}