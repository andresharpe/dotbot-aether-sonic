package com.amazonaws.auth.policy.conditions;

import com.amazonaws.auth.policy.b;
import com.amazonaws.auth.policy.conditions.ArnCondition;
import com.amazonaws.auth.policy.conditions.StringCondition;
import n0.C2372a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23466a = "aws:CurrentTime";

    /* renamed from: b, reason: collision with root package name */
    public static final String f23467b = "aws:SecureTransport";

    /* renamed from: c, reason: collision with root package name */
    public static final String f23468c = "aws:SourceIp";

    /* renamed from: d, reason: collision with root package name */
    public static final String f23469d = "aws:UserAgent";

    /* renamed from: e, reason: collision with root package name */
    public static final String f23470e = "aws:EpochTime";

    /* renamed from: f, reason: collision with root package name */
    public static final String f23471f = "aws:Referer";

    /* renamed from: g, reason: collision with root package name */
    public static final String f23472g = "aws:SourceArn";

    private a() {
    }

    public static b a(StringCondition.StringComparisonType stringComparisonType, String str) {
        return new StringCondition(stringComparisonType, f23471f, str);
    }

    public static b b() {
        return new C2372a(f23467b, true);
    }

    public static b c(String str) {
        return new ArnCondition(ArnCondition.ArnComparisonType.ArnLike, f23472g, str);
    }

    public static b d(StringCondition.StringComparisonType stringComparisonType, String str) {
        return new StringCondition(stringComparisonType, f23469d, str);
    }
}
