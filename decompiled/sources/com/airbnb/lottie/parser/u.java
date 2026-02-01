package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    static JsonReader.a f21999a = JsonReader.a.a("k");

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<com.airbnb.lottie.value.a<T>> a(JsonReader jsonReader, com.airbnb.lottie.g gVar, float f4, M<T> m4, boolean z3) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.v() == JsonReader.Token.STRING) {
            gVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.c();
        while (jsonReader.i()) {
            if (jsonReader.A(f21999a) != 0) {
                jsonReader.F();
            } else if (jsonReader.v() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.b();
                if (jsonReader.v() == JsonReader.Token.NUMBER) {
                    arrayList.add(t.c(jsonReader, gVar, f4, m4, false, z3));
                } else {
                    while (jsonReader.i()) {
                        arrayList.add(t.c(jsonReader, gVar, f4, m4, true, z3));
                    }
                }
                jsonReader.d();
            } else {
                arrayList.add(t.c(jsonReader, gVar, f4, m4, false, z3));
            }
        }
        jsonReader.f();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends com.airbnb.lottie.value.a<T>> list) {
        int i4;
        T t3;
        int size = list.size();
        int i5 = 0;
        while (true) {
            i4 = size - 1;
            if (i5 >= i4) {
                break;
            }
            com.airbnb.lottie.value.a<T> aVar = list.get(i5);
            i5++;
            com.airbnb.lottie.value.a<T> aVar2 = list.get(i5);
            aVar.f23318h = Float.valueOf(aVar2.f23317g);
            if (aVar.f23313c == null && (t3 = aVar2.f23312b) != null) {
                aVar.f23313c = t3;
                if (aVar instanceof com.airbnb.lottie.animation.keyframe.i) {
                    ((com.airbnb.lottie.animation.keyframe.i) aVar).i();
                }
            }
        }
        com.airbnb.lottie.value.a<T> aVar3 = list.get(i4);
        if ((aVar3.f23312b == null || aVar3.f23313c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
