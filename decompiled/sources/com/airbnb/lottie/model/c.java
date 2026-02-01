package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import com.airbnb.lottie.model.content.k;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<k> f21598a;

    /* renamed from: b, reason: collision with root package name */
    private final char f21599b;

    /* renamed from: c, reason: collision with root package name */
    private final double f21600c;

    /* renamed from: d, reason: collision with root package name */
    private final double f21601d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21602e;

    /* renamed from: f, reason: collision with root package name */
    private final String f21603f;

    public c(List<k> list, char c4, double d4, double d5, String str, String str2) {
        this.f21598a = list;
        this.f21599b = c4;
        this.f21600c = d4;
        this.f21601d = d5;
        this.f21602e = str;
        this.f21603f = str2;
    }

    public static int c(char c4, String str, String str2) {
        return (((c4 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<k> a() {
        return this.f21598a;
    }

    public double b() {
        return this.f21601d;
    }

    public int hashCode() {
        return c(this.f21599b, this.f21603f, this.f21602e);
    }
}
