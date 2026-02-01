package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1011c {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21872a = JsonReader.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f21873b = JsonReader.a.a("k");

    private C1011c() {
    }

    private static boolean a(com.airbnb.lottie.model.animatable.e eVar) {
        if (eVar != null && (!eVar.c() || !eVar.b().get(0).f23312b.equals(0.0f, 0.0f))) {
            return false;
        }
        return true;
    }

    private static boolean b(com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar) {
        if (mVar != null && ((mVar instanceof com.airbnb.lottie.model.animatable.i) || !mVar.c() || !mVar.b().get(0).f23312b.equals(0.0f, 0.0f))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean c(com.airbnb.lottie.model.animatable.b bVar) {
        if (bVar != null && (!bVar.c() || ((Float) ((com.airbnb.lottie.value.a) bVar.b().get(0)).f23312b).floatValue() != 0.0f)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean d(com.airbnb.lottie.model.animatable.g gVar) {
        if (gVar != null && (!gVar.c() || !((com.airbnb.lottie.value.k) ((com.airbnb.lottie.value.a) gVar.b().get(0)).f23312b).a(1.0f, 1.0f))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean e(com.airbnb.lottie.model.animatable.b bVar) {
        if (bVar != null && (!bVar.c() || ((Float) ((com.airbnb.lottie.value.a) bVar.b().get(0)).f23312b).floatValue() != 0.0f)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean f(com.airbnb.lottie.model.animatable.b bVar) {
        if (bVar != null && (!bVar.c() || ((Float) ((com.airbnb.lottie.value.a) bVar.b().get(0)).f23312b).floatValue() != 0.0f)) {
            return false;
        }
        return true;
    }

    public static com.airbnb.lottie.model.animatable.l g(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        boolean z3;
        com.airbnb.lottie.model.animatable.e eVar;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar;
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.b bVar3;
        boolean z4;
        boolean z5 = false;
        if (jsonReader.v() == JsonReader.Token.BEGIN_OBJECT) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            jsonReader.c();
        }
        com.airbnb.lottie.model.animatable.b bVar4 = null;
        com.airbnb.lottie.model.animatable.e eVar2 = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar2 = null;
        com.airbnb.lottie.model.animatable.g gVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar5 = null;
        com.airbnb.lottie.model.animatable.b bVar6 = null;
        com.airbnb.lottie.model.animatable.d dVar = null;
        com.airbnb.lottie.model.animatable.b bVar7 = null;
        com.airbnb.lottie.model.animatable.b bVar8 = null;
        while (jsonReader.i()) {
            switch (jsonReader.A(f21872a)) {
                case 0:
                    boolean z6 = z5;
                    jsonReader.c();
                    while (jsonReader.i()) {
                        if (jsonReader.A(f21873b) != 0) {
                            jsonReader.D();
                            jsonReader.F();
                        } else {
                            eVar2 = C1009a.a(jsonReader, gVar);
                        }
                    }
                    jsonReader.f();
                    z5 = z6;
                    continue;
                case 1:
                    mVar2 = C1009a.b(jsonReader, gVar);
                    continue;
                case 2:
                    gVar2 = C1012d.j(jsonReader, gVar);
                    continue;
                case 3:
                    gVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = C1012d.h(jsonReader, gVar);
                    continue;
                case 6:
                    bVar7 = C1012d.f(jsonReader, gVar, z5);
                    continue;
                case 7:
                    bVar8 = C1012d.f(jsonReader, gVar, z5);
                    continue;
                case 8:
                    bVar5 = C1012d.f(jsonReader, gVar, z5);
                    continue;
                case 9:
                    bVar6 = C1012d.f(jsonReader, gVar, z5);
                    continue;
                default:
                    jsonReader.D();
                    jsonReader.F();
                    continue;
            }
            com.airbnb.lottie.model.animatable.b f4 = C1012d.f(jsonReader, gVar, z5);
            if (f4.b().isEmpty()) {
                f4.b().add(new com.airbnb.lottie.value.a(gVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(gVar.f())));
            } else if (((com.airbnb.lottie.value.a) f4.b().get(0)).f23312b == 0) {
                z4 = false;
                f4.b().set(0, new com.airbnb.lottie.value.a(gVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(gVar.f())));
                z5 = z4;
                bVar4 = f4;
            }
            z4 = false;
            z5 = z4;
            bVar4 = f4;
        }
        if (z3) {
            jsonReader.f();
        }
        if (a(eVar2)) {
            eVar = null;
        } else {
            eVar = eVar2;
        }
        if (b(mVar2)) {
            mVar = null;
        } else {
            mVar = mVar2;
        }
        if (c(bVar4)) {
            bVar = null;
        } else {
            bVar = bVar4;
        }
        if (d(gVar2)) {
            gVar2 = null;
        }
        if (f(bVar5)) {
            bVar2 = null;
        } else {
            bVar2 = bVar5;
        }
        if (e(bVar6)) {
            bVar3 = null;
        } else {
            bVar3 = bVar6;
        }
        return new com.airbnb.lottie.model.animatable.l(eVar, mVar, gVar2, bVar, dVar, bVar7, bVar8, bVar2, bVar3);
    }
}
