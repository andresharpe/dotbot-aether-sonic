package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class I {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21864a = JsonReader.a.a("nm", "hd", "it");

    private I() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.k a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z3 = false;
        while (jsonReader.i()) {
            int A3 = jsonReader.A(f21864a);
            if (A3 != 0) {
                if (A3 != 1) {
                    if (A3 != 2) {
                        jsonReader.F();
                    } else {
                        jsonReader.b();
                        while (jsonReader.i()) {
                            com.airbnb.lottie.model.content.c a4 = C1016h.a(jsonReader, gVar);
                            if (a4 != null) {
                                arrayList.add(a4);
                            }
                        }
                        jsonReader.d();
                    }
                } else {
                    z3 = jsonReader.j();
                }
            } else {
                str = jsonReader.p();
            }
        }
        return new com.airbnb.lottie.model.content.k(str, arrayList, z3);
    }
}
