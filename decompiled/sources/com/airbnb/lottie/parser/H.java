package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21863a = JsonReader.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    private H() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.j a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        Path.FillType fillType;
        com.airbnb.lottie.model.animatable.d dVar = null;
        String str = null;
        com.airbnb.lottie.model.animatable.a aVar = null;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = 1;
        while (jsonReader.i()) {
            int A3 = jsonReader.A(f21863a);
            if (A3 != 0) {
                if (A3 != 1) {
                    if (A3 != 2) {
                        if (A3 != 3) {
                            if (A3 != 4) {
                                if (A3 != 5) {
                                    jsonReader.D();
                                    jsonReader.F();
                                } else {
                                    z4 = jsonReader.j();
                                }
                            } else {
                                i4 = jsonReader.m();
                            }
                        } else {
                            z3 = jsonReader.j();
                        }
                    } else {
                        dVar = C1012d.h(jsonReader, gVar);
                    }
                } else {
                    aVar = C1012d.c(jsonReader, gVar);
                }
            } else {
                str = jsonReader.p();
            }
        }
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        com.airbnb.lottie.model.animatable.d dVar2 = dVar;
        if (i4 == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new com.airbnb.lottie.model.content.j(str, z3, fillType, aVar, dVar2, z4);
    }
}
