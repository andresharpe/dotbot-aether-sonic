package com.airbnb.lottie.model;

/* loaded from: classes.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    private static final String f21701d = "\r";

    /* renamed from: a, reason: collision with root package name */
    private final String f21702a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21703b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21704c;

    public g(String str, float f4, float f5) {
        this.f21702a = str;
        this.f21704c = f5;
        this.f21703b = f4;
    }

    public boolean a(String str) {
        if (this.f21702a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f21702a.endsWith(f21701d)) {
            String str2 = this.f21702a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
