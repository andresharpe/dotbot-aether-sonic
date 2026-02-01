package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class G implements M<com.airbnb.lottie.model.content.i> {

    /* renamed from: a, reason: collision with root package name */
    public static final G f21861a = new G();

    /* renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f21862b = JsonReader.a.a("c", "v", "i", "o");

    private G() {
    }

    @Override // com.airbnb.lottie.parser.M
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.i a(JsonReader jsonReader, float f4) throws IOException {
        if (jsonReader.v() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
        }
        jsonReader.c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z3 = false;
        while (jsonReader.i()) {
            int A3 = jsonReader.A(f21862b);
            if (A3 != 0) {
                if (A3 != 1) {
                    if (A3 != 2) {
                        if (A3 != 3) {
                            jsonReader.D();
                            jsonReader.F();
                        } else {
                            list3 = s.f(jsonReader, f4);
                        }
                    } else {
                        list2 = s.f(jsonReader, f4);
                    }
                } else {
                    list = s.f(jsonReader, f4);
                }
            } else {
                z3 = jsonReader.j();
            }
        }
        jsonReader.f();
        if (jsonReader.v() == JsonReader.Token.END_ARRAY) {
            jsonReader.d();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new com.airbnb.lottie.model.content.i(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 1; i4 < size; i4++) {
                PointF pointF2 = list.get(i4);
                int i5 = i4 - 1;
                arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.i.a(list.get(i5), list3.get(i5)), com.airbnb.lottie.utils.i.a(pointF2, list2.get(i4)), pointF2));
            }
            if (z3) {
                PointF pointF3 = list.get(0);
                int i6 = size - 1;
                arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.i.a(list.get(i6), list3.get(i6)), com.airbnb.lottie.utils.i.a(pointF3, list2.get(0)), pointF3));
            }
            return new com.airbnb.lottie.model.content.i(pointF, z3, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
