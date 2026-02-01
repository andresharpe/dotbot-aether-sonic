package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* renamed from: com.airbnb.lottie.parser.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1012d {
    private C1012d() {
    }

    private static <T> List<com.airbnb.lottie.value.a<T>> a(JsonReader jsonReader, float f4, com.airbnb.lottie.g gVar, M<T> m4) throws IOException {
        return u.a(jsonReader, gVar, f4, m4, false);
    }

    private static <T> List<com.airbnb.lottie.value.a<T>> b(JsonReader jsonReader, com.airbnb.lottie.g gVar, M<T> m4) throws IOException {
        return u.a(jsonReader, gVar, 1.0f, m4, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.a c(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.a(b(jsonReader, gVar, C1015g.f21877a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.j d(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.j(b(jsonReader, gVar, C1017i.f21879a));
    }

    public static com.airbnb.lottie.model.animatable.b e(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return f(jsonReader, gVar, true);
    }

    public static com.airbnb.lottie.model.animatable.b f(JsonReader jsonReader, com.airbnb.lottie.g gVar, boolean z3) throws IOException {
        float f4;
        if (z3) {
            f4 = com.airbnb.lottie.utils.j.e();
        } else {
            f4 = 1.0f;
        }
        return new com.airbnb.lottie.model.animatable.b(a(jsonReader, f4, gVar, C1020l.f21893a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.c g(JsonReader jsonReader, com.airbnb.lottie.g gVar, int i4) throws IOException {
        return new com.airbnb.lottie.model.animatable.c(b(jsonReader, gVar, new o(i4)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.d h(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.d(b(jsonReader, gVar, r.f21991a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.f i(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.f(u.a(jsonReader, gVar, com.airbnb.lottie.utils.j.e(), B.f21856a, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.g j(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.g((List<com.airbnb.lottie.value.a<com.airbnb.lottie.value.k>>) b(jsonReader, gVar, F.f21860a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.h k(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.h(a(jsonReader, com.airbnb.lottie.utils.j.e(), gVar, G.f21861a));
    }
}
