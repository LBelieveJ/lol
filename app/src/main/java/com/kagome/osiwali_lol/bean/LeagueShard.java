package com.kagome.osiwali_lol.bean;

import com.google.gson.JsonPrimitive;
import com.kagome.osiwali_lol.exceptions.APIEnumNotUpToDateException;

import java.util.Arrays;
import java.util.List;

/**
 * Created  on 2021/5/20 11:09
 *
 * @author: Osiwali
 */
public enum LeagueShard {
    UNKNOWN(new String[]{"", "", "unknown"}),
    BR1(new String[]{"BR1", "br"}),
    EUN1(new String[]{"EUN1", "eune"}),
    EUW1(new String[]{"EUW1", "euw"}),
    JP1(new String[]{"JP1", "jp"}),
    KR(new String[]{"KR", "kr"}),
    LA1(new String[]{"LA1", "lan", "WAS_LA1"}),
    LA2(new String[]{"LA2", "las"}),
    NA1(new String[]{"NA1", "na"}),
    OC1(new String[]{"OC1", "oc"}),
    TR1(new String[]{"TR1", "tr"}),
    RU(new String[]{"RU", "ru"}),
    PBE1(new String[]{"PBE1", "pbe"}),
    SG(new String[]{"SG", "sg"}),
    PH(new String[]{"PH", "ph"}),
    ID1(new String[]{"ID1", "id"}),
    VN(new String[]{"VN", "vn"}),
    TH(new String[]{"TH", "th"}),
    TW(new String[]{"TW", "tw"});

    private String[] keys;

    private LeagueShard(String... s) {
        this.keys = s;
    }


    public String prettyName() {
        switch (this) {
            case UNKNOWN:
                return "Unknown";
            case BR1:
                return "Brazil";
            case EUN1:
                return "Europe Nordic & East";
            case EUW1:
                return "Europe West";
            case JP1:
                return "Japan";
            case KR:
                return "Korea";
            case LA1:
                return "Latin America North";
            case LA2:
                return "Latin America South";
            case NA1:
                return "North America";
            case OC1:
                return "Oceania";
            case TR1:
                return "Turkey";
            case RU:
                return "Russia";
            case PBE1:
                return "Public Beta Environment";
            case SG:
                return "Singapore";
            case PH:
                return "Philippines";
            case ID1:
                return "Indonesia";
            case VN:
                return "Vitenam";
            case TH:
                return "Thailand";
            case TW:
                return "Taiwan";
            default:
                return "This enum does not have a pretty name";
        }
    }



    public String getValue() {
        return this.keys[0];
    }

    public String getRealmValue() {
        return this.keys[1];
    }

    public RegionShard toRegionShard() {
        switch (this) {
            case UNKNOWN:
                return RegionShard.UNKNOWN;
            case BR1:
            case LA1:
            case LA2:
            case NA1:
            case OC1:
                return RegionShard.AMERICAS;
            case EUN1:
            case EUW1:
            case TR1:
            case RU:
                return RegionShard.EUROPE;
            case JP1:
            case KR:
                return RegionShard.ASIA;
            case PBE1:
                return RegionShard.PBE;
            case SG:
            case PH:
            case ID1:
            case VN:
            case TH:
            case TW:
                return RegionShard.GARENA;
            default:
                throw new APIEnumNotUpToDateException(RegionShard.class, new JsonPrimitive(this.toString()));
        }
    }

    public String toString() {
        return this.getValue();
    }

    public static List<LeagueShard> getDefaultPlatforms() {
        return Arrays.asList(RU, KR, BR1, OC1, JP1, NA1, EUN1, EUW1, TR1, LA1, LA2);
    }

    public static List<LeagueShard> getSpectatorPlatforms() {
        return Arrays.asList(RU, KR, BR1, OC1, JP1, NA1, EUN1, EUW1);
    }

    public static List<LeagueShard> getGarenaPlatforms() {
        return Arrays.asList(SG, PH, ID1, VN, TH, TW);
    }

    public static List<LeagueShard> getValidPlatforms() {
        return Arrays.asList(RU, KR, BR1, OC1, JP1, NA1, EUN1, EUW1, TR1, LA1, LA2, SG, PH, ID1, VN, TH, TW);
    }

    public String[] getKeys() {
        return this.keys;
    }
}
