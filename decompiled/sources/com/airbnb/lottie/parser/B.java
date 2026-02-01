package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class B implements M<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final B f21856a = new B();

    private B() {
    }

    @Override // com.airbnb.lottie.parser.M
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(JsonReader jsonReader, float f4) throws IOException {
        JsonReader.Token v3 = jsonReader.v();
        if (v3 == JsonReader.Token.BEGIN_ARRAY) {
            return s.e(jsonReader, f4);
        }
        if (v3 == JsonReader.Token.BEGIN_OBJECT) {
            return s.e(jsonReader, f4);
        }
        if (v3 == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.k()) * f4, ((float) jsonReader.k()) * f4);
            while (jsonReader.i()) {
                jsonReader.F();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + v3);
    }
}
