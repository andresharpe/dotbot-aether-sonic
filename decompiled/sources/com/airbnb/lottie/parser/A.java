package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class A implements M<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final A f21855a = new A();

    private A() {
    }

    @Override // com.airbnb.lottie.parser.M
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(JsonReader jsonReader, float f4) throws IOException {
        return s.e(jsonReader, f4);
    }
}
