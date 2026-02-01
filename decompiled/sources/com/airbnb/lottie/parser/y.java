package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f22008a = JsonReader.a.a("nm", "mm", "hd");

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MergePaths a(JsonReader jsonReader) throws IOException {
        String str = null;
        boolean z3 = false;
        MergePaths.MergePathsMode mergePathsMode = null;
        while (jsonReader.i()) {
            int A3 = jsonReader.A(f22008a);
            if (A3 != 0) {
                if (A3 != 1) {
                    if (A3 != 2) {
                        jsonReader.D();
                        jsonReader.F();
                    } else {
                        z3 = jsonReader.j();
                    }
                } else {
                    mergePathsMode = MergePaths.MergePathsMode.b(jsonReader.m());
                }
            } else {
                str = jsonReader.p();
            }
        }
        return new MergePaths(str, mergePathsMode, z3);
    }
}
