package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21988a = JsonReader.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f21989b = JsonReader.a.a("p", "k");

    /* renamed from: c, reason: collision with root package name */
    private static final JsonReader.a f21990c = JsonReader.a.a("n", "v");

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.f a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        String str;
        com.airbnb.lottie.model.animatable.c cVar;
        GradientType gradientType;
        ArrayList arrayList = new ArrayList();
        float f4 = 0.0f;
        String str2 = null;
        GradientType gradientType2 = null;
        com.airbnb.lottie.model.animatable.c cVar2 = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.f fVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        boolean z3 = false;
        com.airbnb.lottie.model.animatable.d dVar = null;
        while (jsonReader.i()) {
            switch (jsonReader.A(f21988a)) {
                case 0:
                    str2 = jsonReader.p();
                    continue;
                case 1:
                    str = str2;
                    jsonReader.c();
                    int i4 = -1;
                    while (jsonReader.i()) {
                        int A3 = jsonReader.A(f21989b);
                        if (A3 != 0) {
                            cVar = cVar2;
                            if (A3 != 1) {
                                jsonReader.D();
                                jsonReader.F();
                            } else {
                                cVar2 = C1012d.g(jsonReader, gVar, i4);
                            }
                        } else {
                            cVar = cVar2;
                            i4 = jsonReader.m();
                        }
                        cVar2 = cVar;
                    }
                    jsonReader.f();
                    break;
                case 2:
                    dVar = C1012d.h(jsonReader, gVar);
                    continue;
                case 3:
                    str = str2;
                    if (jsonReader.m() == 1) {
                        gradientType = GradientType.LINEAR;
                    } else {
                        gradientType = GradientType.RADIAL;
                    }
                    gradientType2 = gradientType;
                    break;
                case 4:
                    fVar = C1012d.i(jsonReader, gVar);
                    continue;
                case 5:
                    fVar2 = C1012d.i(jsonReader, gVar);
                    continue;
                case 6:
                    bVar = C1012d.e(jsonReader, gVar);
                    continue;
                case 7:
                    str = str2;
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.m() - 1];
                    break;
                case 8:
                    str = str2;
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.m() - 1];
                    break;
                case 9:
                    str = str2;
                    f4 = (float) jsonReader.k();
                    break;
                case 10:
                    z3 = jsonReader.j();
                    continue;
                case 11:
                    jsonReader.b();
                    while (jsonReader.i()) {
                        jsonReader.c();
                        String str3 = null;
                        com.airbnb.lottie.model.animatable.b bVar3 = null;
                        while (jsonReader.i()) {
                            int A4 = jsonReader.A(f21990c);
                            if (A4 != 0) {
                                com.airbnb.lottie.model.animatable.b bVar4 = bVar2;
                                if (A4 != 1) {
                                    jsonReader.D();
                                    jsonReader.F();
                                } else {
                                    bVar3 = C1012d.e(jsonReader, gVar);
                                }
                                bVar2 = bVar4;
                            } else {
                                str3 = jsonReader.p();
                            }
                        }
                        com.airbnb.lottie.model.animatable.b bVar5 = bVar2;
                        jsonReader.f();
                        if (str3.equals("o")) {
                            bVar2 = bVar3;
                        } else {
                            if (str3.equals("d") || str3.equals("g")) {
                                gVar.y(true);
                                arrayList.add(bVar3);
                            }
                            bVar2 = bVar5;
                        }
                    }
                    com.airbnb.lottie.model.animatable.b bVar6 = bVar2;
                    jsonReader.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((com.airbnb.lottie.model.animatable.b) arrayList.get(0));
                    }
                    bVar2 = bVar6;
                    continue;
                default:
                    jsonReader.D();
                    jsonReader.F();
                    continue;
            }
            str2 = str;
        }
        String str4 = str2;
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new com.airbnb.lottie.model.content.f(str4, gradientType2, cVar2, dVar, fVar, fVar2, bVar, lineCapType, lineJoinType, f4, arrayList, bVar2, z3);
    }
}
