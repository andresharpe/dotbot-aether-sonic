package com.harman.rating.model;

import kotlin.E;
import kotlin.enums.a;
import kotlin.enums.c;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/harman/rating/model/RatingGuideType;", "", "(Ljava/lang/String;I)V", "RATING_NONE", "RATING_WITH_NOT_NOW", "RATING_WITH_NEVER", "0_ratingInApp_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RatingGuideType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RatingGuideType[] $VALUES;
    public static final RatingGuideType RATING_NONE = new RatingGuideType("RATING_NONE", 0);
    public static final RatingGuideType RATING_WITH_NOT_NOW = new RatingGuideType("RATING_WITH_NOT_NOW", 1);
    public static final RatingGuideType RATING_WITH_NEVER = new RatingGuideType("RATING_WITH_NEVER", 2);

    static {
        RatingGuideType[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private RatingGuideType(String str, int i4) {
    }

    private static final /* synthetic */ RatingGuideType[] b() {
        return new RatingGuideType[]{RATING_NONE, RATING_WITH_NOT_NOW, RATING_WITH_NEVER};
    }

    @d
    public static a<RatingGuideType> e() {
        return $ENTRIES;
    }

    public static RatingGuideType valueOf(String str) {
        return (RatingGuideType) Enum.valueOf(RatingGuideType.class, str);
    }

    public static RatingGuideType[] values() {
        return (RatingGuideType[]) $VALUES.clone();
    }
}
