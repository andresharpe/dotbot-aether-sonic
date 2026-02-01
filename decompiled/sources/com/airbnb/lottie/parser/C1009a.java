package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.parser.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1009a {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21869a = JsonReader.a.a("k", "x", "y");

    private C1009a() {
    }

    public static com.airbnb.lottie.model.animatable.e a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.v() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
            while (jsonReader.i()) {
                arrayList.add(z.a(jsonReader, gVar));
            }
            jsonReader.d();
            u.b(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.value.a(s.e(jsonReader, com.airbnb.lottie.utils.j.e())));
        }
        return new com.airbnb.lottie.model.animatable.e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.m<PointF, PointF> b(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        jsonReader.c();
        com.airbnb.lottie.model.animatable.e eVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        boolean z3 = false;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        while (jsonReader.v() != JsonReader.Token.END_OBJECT) {
            int A3 = jsonReader.A(f21869a);
            if (A3 != 0) {
                if (A3 != 1) {
                    if (A3 != 2) {
                        jsonReader.D();
                        jsonReader.F();
                    } else if (jsonReader.v() == JsonReader.Token.STRING) {
                        jsonReader.F();
                        z3 = true;
                    } else {
                        bVar = C1012d.e(jsonReader, gVar);
                    }
                } else if (jsonReader.v() == JsonReader.Token.STRING) {
                    jsonReader.F();
                    z3 = true;
                } else {
                    bVar2 = C1012d.e(jsonReader, gVar);
                }
            } else {
                eVar = a(jsonReader, gVar);
            }
        }
        jsonReader.f();
        if (z3) {
            gVar.a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new com.airbnb.lottie.model.animatable.i(bVar2, bVar);
    }
}
