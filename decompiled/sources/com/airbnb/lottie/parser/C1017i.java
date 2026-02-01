package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1017i implements M<DocumentData> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1017i f21879a = new C1017i();

    /* renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f21880b = JsonReader.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C1017i() {
    }

    @Override // com.airbnb.lottie.parser.M
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DocumentData a(JsonReader jsonReader, float f4) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.c();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = true;
        while (jsonReader.i()) {
            switch (jsonReader.A(f21880b)) {
                case 0:
                    str = jsonReader.p();
                    break;
                case 1:
                    str2 = jsonReader.p();
                    break;
                case 2:
                    f5 = (float) jsonReader.k();
                    break;
                case 3:
                    int m4 = jsonReader.m();
                    justification2 = DocumentData.Justification.CENTER;
                    if (m4 <= justification2.ordinal() && m4 >= 0) {
                        justification2 = DocumentData.Justification.values()[m4];
                        break;
                    }
                    break;
                case 4:
                    i4 = jsonReader.m();
                    break;
                case 5:
                    f6 = (float) jsonReader.k();
                    break;
                case 6:
                    f7 = (float) jsonReader.k();
                    break;
                case 7:
                    i5 = s.d(jsonReader);
                    break;
                case 8:
                    i6 = s.d(jsonReader);
                    break;
                case 9:
                    f8 = (float) jsonReader.k();
                    break;
                case 10:
                    z3 = jsonReader.j();
                    break;
                default:
                    jsonReader.D();
                    jsonReader.F();
                    break;
            }
        }
        jsonReader.f();
        return new DocumentData(str, str2, f5, justification2, i4, f6, f7, i5, i6, f8, z3);
    }
}
