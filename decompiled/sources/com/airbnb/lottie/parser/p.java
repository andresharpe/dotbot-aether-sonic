package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21986a = JsonReader.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f21987b = JsonReader.a.a("p", "k");

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.e a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        com.airbnb.lottie.model.animatable.d dVar;
        GradientType gradientType;
        Path.FillType fillType;
        com.airbnb.lottie.model.animatable.d dVar2 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType2 = null;
        com.airbnb.lottie.model.animatable.c cVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.f fVar2 = null;
        boolean z3 = false;
        while (jsonReader.i()) {
            switch (jsonReader.A(f21986a)) {
                case 0:
                    str = jsonReader.p();
                    break;
                case 1:
                    jsonReader.c();
                    int i4 = -1;
                    while (jsonReader.i()) {
                        int A3 = jsonReader.A(f21987b);
                        if (A3 != 0) {
                            if (A3 != 1) {
                                jsonReader.D();
                                jsonReader.F();
                            } else {
                                cVar = C1012d.g(jsonReader, gVar, i4);
                            }
                        } else {
                            i4 = jsonReader.m();
                        }
                    }
                    jsonReader.f();
                    break;
                case 2:
                    dVar2 = C1012d.h(jsonReader, gVar);
                    break;
                case 3:
                    if (jsonReader.m() == 1) {
                        gradientType = GradientType.LINEAR;
                    } else {
                        gradientType = GradientType.RADIAL;
                    }
                    gradientType2 = gradientType;
                    break;
                case 4:
                    fVar = C1012d.i(jsonReader, gVar);
                    break;
                case 5:
                    fVar2 = C1012d.i(jsonReader, gVar);
                    break;
                case 6:
                    if (jsonReader.m() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 7:
                    z3 = jsonReader.j();
                    break;
                default:
                    jsonReader.D();
                    jsonReader.F();
                    break;
            }
        }
        if (dVar2 == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        } else {
            dVar = dVar2;
        }
        return new com.airbnb.lottie.model.content.e(str, gradientType2, fillType2, cVar, dVar, fVar, fVar2, null, null, z3);
    }
}
