package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1014f {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21876a = JsonReader.a.a("nm", "p", "s", "hd", "d");

    private C1014f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.b a(JsonReader jsonReader, com.airbnb.lottie.g gVar, int i4) throws IOException {
        boolean z3;
        if (i4 == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z4 = z3;
        boolean z5 = false;
        String str = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        while (jsonReader.i()) {
            int A3 = jsonReader.A(f21876a);
            if (A3 != 0) {
                if (A3 != 1) {
                    if (A3 != 2) {
                        if (A3 != 3) {
                            if (A3 != 4) {
                                jsonReader.D();
                                jsonReader.F();
                            } else if (jsonReader.m() == 3) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        } else {
                            z5 = jsonReader.j();
                        }
                    } else {
                        fVar = C1012d.i(jsonReader, gVar);
                    }
                } else {
                    mVar = C1009a.b(jsonReader, gVar);
                }
            } else {
                str = jsonReader.p();
            }
        }
        return new com.airbnb.lottie.model.content.b(str, mVar, fVar, z4, z5);
    }
}
