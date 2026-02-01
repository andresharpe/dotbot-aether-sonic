package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f22000a = JsonReader.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f22001b = JsonReader.a.a("d", "a");

    /* renamed from: c, reason: collision with root package name */
    private static final JsonReader.a f22002c = JsonReader.a.a("ty", "nm");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22003a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f22003a = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22003a[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private v() {
    }

    public static Layer a(com.airbnb.lottie.g gVar) {
        Rect b4 = gVar.b();
        return new Layer(Collections.emptyList(), gVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new com.airbnb.lottie.model.animatable.l(), 0, 0, 0, 0.0f, 0.0f, b4.width(), b4.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false, null, null);
    }

    public static Layer b(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f4;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        jsonReader.c();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        Layer.MatteType matteType2 = matteType;
        Layer.LayerType layerType = null;
        String str = null;
        com.airbnb.lottie.model.animatable.l lVar = null;
        com.airbnb.lottie.model.animatable.j jVar = null;
        com.airbnb.lottie.model.animatable.k kVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.content.a aVar = null;
        C1018j c1018j = null;
        long j4 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z3 = false;
        float f5 = 1.0f;
        long j5 = -1;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        String str2 = "UNSET";
        String str3 = null;
        while (jsonReader.i()) {
            switch (jsonReader.A(f22000a)) {
                case 0:
                    str2 = jsonReader.p();
                    break;
                case 1:
                    j4 = jsonReader.m();
                    break;
                case 2:
                    str = jsonReader.p();
                    break;
                case 3:
                    int m4 = jsonReader.m();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (m4 >= layerType.ordinal()) {
                        break;
                    } else {
                        layerType = Layer.LayerType.values()[m4];
                        break;
                    }
                case 4:
                    j5 = jsonReader.m();
                    break;
                case 5:
                    i4 = (int) (jsonReader.m() * com.airbnb.lottie.utils.j.e());
                    break;
                case 6:
                    i5 = (int) (jsonReader.m() * com.airbnb.lottie.utils.j.e());
                    break;
                case 7:
                    i6 = Color.parseColor(jsonReader.p());
                    break;
                case 8:
                    lVar = C1011c.g(jsonReader, gVar);
                    break;
                case 9:
                    int m5 = jsonReader.m();
                    if (m5 >= Layer.MatteType.values().length) {
                        gVar.a("Unsupported matte type: " + m5);
                        break;
                    } else {
                        matteType2 = Layer.MatteType.values()[m5];
                        int i9 = a.f22003a[matteType2.ordinal()];
                        if (i9 != 1) {
                            if (i9 == 2) {
                                gVar.a("Unsupported matte type: Luma Inverted");
                            }
                        } else {
                            gVar.a("Unsupported matte type: Luma");
                        }
                        gVar.v(1);
                        break;
                    }
                case 10:
                    jsonReader.b();
                    while (jsonReader.i()) {
                        arrayList3.add(x.a(jsonReader, gVar));
                    }
                    gVar.v(arrayList3.size());
                    jsonReader.d();
                    break;
                case 11:
                    jsonReader.b();
                    while (jsonReader.i()) {
                        com.airbnb.lottie.model.content.c a4 = C1016h.a(jsonReader, gVar);
                        if (a4 != null) {
                            arrayList4.add(a4);
                        }
                    }
                    jsonReader.d();
                    break;
                case 12:
                    jsonReader.c();
                    while (jsonReader.i()) {
                        int A3 = jsonReader.A(f22001b);
                        if (A3 != 0) {
                            if (A3 != 1) {
                                jsonReader.D();
                                jsonReader.F();
                            } else {
                                jsonReader.b();
                                if (jsonReader.i()) {
                                    kVar = C1010b.a(jsonReader, gVar);
                                }
                                while (jsonReader.i()) {
                                    jsonReader.F();
                                }
                                jsonReader.d();
                            }
                        } else {
                            jVar = C1012d.d(jsonReader, gVar);
                        }
                    }
                    jsonReader.f();
                    break;
                case 13:
                    jsonReader.b();
                    ArrayList arrayList5 = new ArrayList();
                    while (jsonReader.i()) {
                        jsonReader.c();
                        while (jsonReader.i()) {
                            int A4 = jsonReader.A(f22002c);
                            if (A4 != 0) {
                                if (A4 != 1) {
                                    jsonReader.D();
                                    jsonReader.F();
                                } else {
                                    arrayList5.add(jsonReader.p());
                                }
                            } else {
                                int m6 = jsonReader.m();
                                if (m6 == 29) {
                                    aVar = C1013e.b(jsonReader, gVar);
                                } else if (m6 == 25) {
                                    c1018j = new C1019k().b(jsonReader, gVar);
                                }
                            }
                        }
                        jsonReader.f();
                    }
                    jsonReader.d();
                    gVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f5 = (float) jsonReader.k();
                    break;
                case 15:
                    f7 = (float) jsonReader.k();
                    break;
                case 16:
                    i7 = (int) (jsonReader.m() * com.airbnb.lottie.utils.j.e());
                    break;
                case 17:
                    i8 = (int) (jsonReader.m() * com.airbnb.lottie.utils.j.e());
                    break;
                case 18:
                    f6 = (float) jsonReader.k();
                    break;
                case 19:
                    f8 = (float) jsonReader.k();
                    break;
                case 20:
                    bVar = C1012d.f(jsonReader, gVar, false);
                    break;
                case 21:
                    str3 = jsonReader.p();
                    break;
                case 22:
                    z3 = jsonReader.j();
                    break;
                default:
                    jsonReader.D();
                    jsonReader.F();
                    break;
            }
        }
        jsonReader.f();
        ArrayList arrayList6 = new ArrayList();
        if (f6 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new com.airbnb.lottie.value.a(gVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f6)));
            f4 = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f4 = 0.0f;
        }
        if (f8 <= f4) {
            f8 = gVar.f();
        }
        arrayList2.add(new com.airbnb.lottie.value.a(gVar, valueOf, valueOf, null, f6, Float.valueOf(f8)));
        arrayList2.add(new com.airbnb.lottie.value.a(gVar, valueOf2, valueOf2, null, f8, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            gVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList4, gVar, str2, j4, layerType, j5, str, arrayList, lVar, i4, i5, i6, f5, f7, i7, i8, jVar, kVar, arrayList2, matteType2, bVar, z3, aVar, c1018j);
    }
}
