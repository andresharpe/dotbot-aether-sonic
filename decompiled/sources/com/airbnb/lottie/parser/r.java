package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class r implements M<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final r f21991a = new r();

    private r() {
    }

    @Override // com.airbnb.lottie.parser.M
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(JsonReader jsonReader, float f4) throws IOException {
        return Integer.valueOf(Math.round(s.g(jsonReader) * f4));
    }
}
