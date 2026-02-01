package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1020l implements M<Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1020l f21893a = new C1020l();

    private C1020l() {
    }

    @Override // com.airbnb.lottie.parser.M
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float a(JsonReader jsonReader, float f4) throws IOException {
        return Float.valueOf(s.g(jsonReader) * f4);
    }
}
