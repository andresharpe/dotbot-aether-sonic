package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21857a = JsonReader.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    private C() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PolystarShape a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        String str = null;
        PolystarShape.Type type = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        com.airbnb.lottie.model.animatable.b bVar4 = null;
        com.airbnb.lottie.model.animatable.b bVar5 = null;
        com.airbnb.lottie.model.animatable.b bVar6 = null;
        boolean z3 = false;
        while (jsonReader.i()) {
            switch (jsonReader.A(f21857a)) {
                case 0:
                    str = jsonReader.p();
                    break;
                case 1:
                    type = PolystarShape.Type.b(jsonReader.m());
                    break;
                case 2:
                    bVar = C1012d.f(jsonReader, gVar, false);
                    break;
                case 3:
                    mVar = C1009a.b(jsonReader, gVar);
                    break;
                case 4:
                    bVar2 = C1012d.f(jsonReader, gVar, false);
                    break;
                case 5:
                    bVar4 = C1012d.e(jsonReader, gVar);
                    break;
                case 6:
                    bVar6 = C1012d.f(jsonReader, gVar, false);
                    break;
                case 7:
                    bVar3 = C1012d.e(jsonReader, gVar);
                    break;
                case 8:
                    bVar5 = C1012d.f(jsonReader, gVar, false);
                    break;
                case 9:
                    z3 = jsonReader.j();
                    break;
                default:
                    jsonReader.D();
                    jsonReader.F();
                    break;
            }
        }
        return new PolystarShape(str, type, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z3);
    }
}
