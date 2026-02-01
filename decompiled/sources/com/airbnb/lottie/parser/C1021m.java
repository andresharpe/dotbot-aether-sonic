package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.firebase.messaging.C1821f;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1021m {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21894a = JsonReader.a.a("ch", "size", "w", "style", "fFamily", C1821f.C0339f.a.f37006R);

    /* renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f21895b = JsonReader.a.a("shapes");

    private C1021m() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.c a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.c();
        double d4 = 0.0d;
        String str = null;
        String str2 = null;
        char c4 = 0;
        double d5 = 0.0d;
        while (jsonReader.i()) {
            int A3 = jsonReader.A(f21894a);
            if (A3 != 0) {
                if (A3 != 1) {
                    if (A3 != 2) {
                        if (A3 != 3) {
                            if (A3 != 4) {
                                if (A3 != 5) {
                                    jsonReader.D();
                                    jsonReader.F();
                                } else {
                                    jsonReader.c();
                                    while (jsonReader.i()) {
                                        if (jsonReader.A(f21895b) != 0) {
                                            jsonReader.D();
                                            jsonReader.F();
                                        } else {
                                            jsonReader.b();
                                            while (jsonReader.i()) {
                                                arrayList.add((com.airbnb.lottie.model.content.k) C1016h.a(jsonReader, gVar));
                                            }
                                            jsonReader.d();
                                        }
                                    }
                                    jsonReader.f();
                                }
                            } else {
                                str2 = jsonReader.p();
                            }
                        } else {
                            str = jsonReader.p();
                        }
                    } else {
                        d4 = jsonReader.k();
                    }
                } else {
                    d5 = jsonReader.k();
                }
            } else {
                c4 = jsonReader.p().charAt(0);
            }
        }
        jsonReader.f();
        return new com.airbnb.lottie.model.c(arrayList, c4, d5, d4, str, str2);
    }
}
