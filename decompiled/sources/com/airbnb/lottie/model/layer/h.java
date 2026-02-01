package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.o;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.j;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.animatable.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends com.airbnb.lottie.model.layer.b {

    /* renamed from: F, reason: collision with root package name */
    private final StringBuilder f21786F;

    /* renamed from: G, reason: collision with root package name */
    private final RectF f21787G;

    /* renamed from: H, reason: collision with root package name */
    private final Matrix f21788H;

    /* renamed from: I, reason: collision with root package name */
    private final Paint f21789I;

    /* renamed from: J, reason: collision with root package name */
    private final Paint f21790J;

    /* renamed from: K, reason: collision with root package name */
    private final Map<com.airbnb.lottie.model.c, List<com.airbnb.lottie.animation.content.d>> f21791K;

    /* renamed from: L, reason: collision with root package name */
    private final androidx.collection.h<String> f21792L;

    /* renamed from: M, reason: collision with root package name */
    private final o f21793M;

    /* renamed from: N, reason: collision with root package name */
    private final j f21794N;

    /* renamed from: O, reason: collision with root package name */
    private final com.airbnb.lottie.g f21795O;

    /* renamed from: P, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f21796P;

    /* renamed from: Q, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f21797Q;

    /* renamed from: R, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f21798R;

    /* renamed from: S, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f21799S;

    /* renamed from: T, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f21800T;

    /* renamed from: U, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f21801U;

    /* renamed from: V, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f21802V;

    /* renamed from: W, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f21803W;

    /* renamed from: X, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f21804X;

    /* renamed from: Y, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> f21805Y;

    /* loaded from: classes.dex */
    class a extends Paint {
        a(int i4) {
            super(i4);
            setStyle(Paint.Style.FILL);
        }
    }

    /* loaded from: classes.dex */
    class b extends Paint {
        b(int i4) {
            super(i4);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21808a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f21808a = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21808a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21808a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(j jVar, Layer layer) {
        super(jVar, layer);
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.a aVar;
        com.airbnb.lottie.model.animatable.a aVar2;
        this.f21786F = new StringBuilder(2);
        this.f21787G = new RectF();
        this.f21788H = new Matrix();
        this.f21789I = new a(1);
        this.f21790J = new b(1);
        this.f21791K = new HashMap();
        this.f21792L = new androidx.collection.h<>();
        this.f21794N = jVar;
        this.f21795O = layer.b();
        o a4 = layer.s().a();
        this.f21793M = a4;
        a4.a(this);
        i(a4);
        k t3 = layer.t();
        if (t3 != null && (aVar2 = t3.f21579a) != null) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a5 = aVar2.a();
            this.f21796P = a5;
            a5.a(this);
            i(this.f21796P);
        }
        if (t3 != null && (aVar = t3.f21580b) != null) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a6 = aVar.a();
            this.f21798R = a6;
            a6.a(this);
            i(this.f21798R);
        }
        if (t3 != null && (bVar2 = t3.f21581c) != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a7 = bVar2.a();
            this.f21800T = a7;
            a7.a(this);
            i(this.f21800T);
        }
        if (t3 != null && (bVar = t3.f21582d) != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a8 = bVar.a();
            this.f21802V = a8;
            a8.a(this);
            i(this.f21802V);
        }
    }

    private void O(DocumentData.Justification justification, Canvas canvas, float f4) {
        int i4 = c.f21808a[justification.ordinal()];
        if (i4 != 2) {
            if (i4 == 3) {
                canvas.translate((-f4) / 2.0f, 0.0f);
                return;
            }
            return;
        }
        canvas.translate(-f4, 0.0f);
    }

    private String P(String str, int i4) {
        int codePointAt = str.codePointAt(i4);
        int charCount = Character.charCount(codePointAt) + i4;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!c0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j4 = codePointAt;
        if (this.f21792L.e(j4)) {
            return this.f21792L.i(j4);
        }
        this.f21786F.setLength(0);
        while (i4 < charCount) {
            int codePointAt3 = str.codePointAt(i4);
            this.f21786F.appendCodePoint(codePointAt3);
            i4 += Character.charCount(codePointAt3);
        }
        String sb = this.f21786F.toString();
        this.f21792L.p(j4, sb);
        return sb;
    }

    private void Q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void R(com.airbnb.lottie.model.c cVar, Matrix matrix, float f4, DocumentData documentData, Canvas canvas) {
        List<com.airbnb.lottie.animation.content.d> Y3 = Y(cVar);
        for (int i4 = 0; i4 < Y3.size(); i4++) {
            Path g4 = Y3.get(i4).g();
            g4.computeBounds(this.f21787G, false);
            this.f21788H.set(matrix);
            this.f21788H.preTranslate(0.0f, (-documentData.f21568g) * com.airbnb.lottie.utils.j.e());
            this.f21788H.preScale(f4, f4);
            g4.transform(this.f21788H);
            if (documentData.f21572k) {
                U(g4, this.f21789I, canvas);
                U(g4, this.f21790J, canvas);
            } else {
                U(g4, this.f21790J, canvas);
                U(g4, this.f21789I, canvas);
            }
        }
    }

    private void S(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.f21572k) {
            Q(str, this.f21789I, canvas);
            Q(str, this.f21790J, canvas);
        } else {
            Q(str, this.f21790J, canvas);
            Q(str, this.f21789I, canvas);
        }
    }

    private void T(String str, DocumentData documentData, Canvas canvas, float f4) {
        int i4 = 0;
        while (i4 < str.length()) {
            String P3 = P(str, i4);
            i4 += P3.length();
            S(P3, documentData, canvas);
            canvas.translate(this.f21789I.measureText(P3) + f4, 0.0f);
        }
    }

    private void U(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void V(String str, DocumentData documentData, Matrix matrix, com.airbnb.lottie.model.b bVar, Canvas canvas, float f4, float f5) {
        float floatValue;
        for (int i4 = 0; i4 < str.length(); i4++) {
            com.airbnb.lottie.model.c i5 = this.f21795O.c().i(com.airbnb.lottie.model.c.c(str.charAt(i4), bVar.b(), bVar.d()));
            if (i5 != null) {
                R(i5, matrix, f5, documentData, canvas);
                float b4 = ((float) i5.b()) * f5 * com.airbnb.lottie.utils.j.e() * f4;
                float f6 = documentData.f21566e / 10.0f;
                com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.f21803W;
                if (aVar != null) {
                    floatValue = aVar.h().floatValue();
                } else {
                    com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f21802V;
                    if (aVar2 != null) {
                        floatValue = aVar2.h().floatValue();
                    }
                    canvas.translate(b4 + (f6 * f4), 0.0f);
                }
                f6 += floatValue;
                canvas.translate(b4 + (f6 * f4), 0.0f);
            }
        }
    }

    private void W(DocumentData documentData, Matrix matrix, com.airbnb.lottie.model.b bVar, Canvas canvas) {
        float f4;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.f21804X;
        if (aVar != null) {
            f4 = aVar.h().floatValue();
        } else {
            f4 = documentData.f21564c;
        }
        float f5 = f4 / 100.0f;
        float g4 = com.airbnb.lottie.utils.j.g(matrix);
        String str = documentData.f21562a;
        float e4 = documentData.f21567f * com.airbnb.lottie.utils.j.e();
        List<String> a02 = a0(str);
        int size = a02.size();
        for (int i4 = 0; i4 < size; i4++) {
            String str2 = a02.get(i4);
            float Z3 = Z(str2, bVar, f5, g4);
            canvas.save();
            O(documentData.f21565d, canvas, Z3);
            canvas.translate(0.0f, (i4 * e4) - (((size - 1) * e4) / 2.0f));
            V(str2, documentData, matrix, bVar, canvas, g4, f5);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008f A[LOOP:0: B:16:0x008d->B:17:0x008f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void X(com.airbnb.lottie.model.DocumentData r8, com.airbnb.lottie.model.b r9, android.graphics.Canvas r10) {
        /*
            r7 = this;
            android.graphics.Typeface r9 = r7.b0(r9)
            if (r9 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r8.f21562a
            com.airbnb.lottie.j r1 = r7.f21794N
            com.airbnb.lottie.v r1 = r1.O()
            if (r1 == 0) goto L19
            java.lang.String r2 = r7.getName()
            java.lang.String r0 = r1.c(r2, r0)
        L19:
            android.graphics.Paint r1 = r7.f21789I
            r1.setTypeface(r9)
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r9 = r7.f21804X
            if (r9 == 0) goto L2d
            java.lang.Object r9 = r9.h()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L2f
        L2d:
            float r9 = r8.f21564c
        L2f:
            android.graphics.Paint r1 = r7.f21789I
            float r2 = com.airbnb.lottie.utils.j.e()
            float r2 = r2 * r9
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.f21790J
            android.graphics.Paint r2 = r7.f21789I
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.f21790J
            android.graphics.Paint r2 = r7.f21789I
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            float r1 = r8.f21567f
            float r2 = com.airbnb.lottie.utils.j.e()
            float r1 = r1 * r2
            int r2 = r8.f21566e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r3 = r7.f21803W
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6a:
            float r2 = r2 + r3
            goto L7b
        L6c:
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r3 = r7.f21802V
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6a
        L7b:
            float r3 = com.airbnb.lottie.utils.j.e()
            float r2 = r2 * r3
            float r2 = r2 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r9
            java.util.List r9 = r7.a0(r0)
            int r0 = r9.size()
            r3 = 0
        L8d:
            if (r3 >= r0) goto Lc3
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.f21790J
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10.save()
            com.airbnb.lottie.model.DocumentData$Justification r6 = r8.f21565d
            r7.O(r6, r10, r5)
            int r5 = r0 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r3
            float r6 = r6 * r1
            float r6 = r6 - r5
            r5 = 0
            r10.translate(r5, r6)
            r7.T(r4, r8, r10, r2)
            r10.restore()
            int r3 = r3 + 1
            goto L8d
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.h.X(com.airbnb.lottie.model.DocumentData, com.airbnb.lottie.model.b, android.graphics.Canvas):void");
    }

    private List<com.airbnb.lottie.animation.content.d> Y(com.airbnb.lottie.model.c cVar) {
        if (this.f21791K.containsKey(cVar)) {
            return this.f21791K.get(cVar);
        }
        List<com.airbnb.lottie.model.content.k> a4 = cVar.a();
        int size = a4.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new com.airbnb.lottie.animation.content.d(this.f21794N, this, a4.get(i4)));
        }
        this.f21791K.put(cVar, arrayList);
        return arrayList;
    }

    private float Z(String str, com.airbnb.lottie.model.b bVar, float f4, float f5) {
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            com.airbnb.lottie.model.c i5 = this.f21795O.c().i(com.airbnb.lottie.model.c.c(str.charAt(i4), bVar.b(), bVar.d()));
            if (i5 != null) {
                f6 = (float) (f6 + (i5.b() * f4 * com.airbnb.lottie.utils.j.e() * f5));
            }
        }
        return f6;
    }

    private List<String> a0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @P
    private Typeface b0(com.airbnb.lottie.model.b bVar) {
        Typeface h4;
        com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> aVar = this.f21805Y;
        if (aVar != null && (h4 = aVar.h()) != null) {
            return h4;
        }
        Typeface P3 = this.f21794N.P(bVar.b(), bVar.d());
        if (P3 != null) {
            return P3;
        }
        return bVar.e();
    }

    private boolean c0(int i4) {
        if (Character.getType(i4) != 16 && Character.getType(i4) != 27 && Character.getType(i4) != 6 && Character.getType(i4) != 28 && Character.getType(i4) != 19) {
            return false;
        }
        return true;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        rectF.set(0.0f, 0.0f, this.f21795O.b().width(), this.f21795O.b().height());
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        super.h(t3, jVar);
        if (t3 == com.airbnb.lottie.o.f21827a) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.f21797Q;
            if (aVar != null) {
                G(aVar);
            }
            if (jVar == null) {
                this.f21797Q = null;
                return;
            }
            q qVar = new q(jVar);
            this.f21797Q = qVar;
            qVar.a(this);
            i(this.f21797Q);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21828b) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.f21799S;
            if (aVar2 != null) {
                G(aVar2);
            }
            if (jVar == null) {
                this.f21799S = null;
                return;
            }
            q qVar2 = new q(jVar);
            this.f21799S = qVar2;
            qVar2.a(this);
            i(this.f21799S);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21845s) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar3 = this.f21801U;
            if (aVar3 != null) {
                G(aVar3);
            }
            if (jVar == null) {
                this.f21801U = null;
                return;
            }
            q qVar3 = new q(jVar);
            this.f21801U = qVar3;
            qVar3.a(this);
            i(this.f21801U);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21846t) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar4 = this.f21803W;
            if (aVar4 != null) {
                G(aVar4);
            }
            if (jVar == null) {
                this.f21803W = null;
                return;
            }
            q qVar4 = new q(jVar);
            this.f21803W = qVar4;
            qVar4.a(this);
            i(this.f21803W);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21818F) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar5 = this.f21804X;
            if (aVar5 != null) {
                G(aVar5);
            }
            if (jVar == null) {
                this.f21804X = null;
                return;
            }
            q qVar5 = new q(jVar);
            this.f21804X = qVar5;
            qVar5.a(this);
            i(this.f21804X);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21825M) {
            com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> aVar6 = this.f21805Y;
            if (aVar6 != null) {
                G(aVar6);
            }
            if (jVar == null) {
                this.f21805Y = null;
                return;
            }
            q qVar6 = new q(jVar);
            this.f21805Y = qVar6;
            qVar6.a(this);
            i(this.f21805Y);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(Canvas canvas, Matrix matrix, int i4) {
        int intValue;
        canvas.save();
        if (!this.f21794N.J0()) {
            canvas.concat(matrix);
        }
        DocumentData h4 = this.f21793M.h();
        com.airbnb.lottie.model.b bVar = this.f21795O.g().get(h4.f21563b);
        if (bVar == null) {
            canvas.restore();
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.f21797Q;
        if (aVar != null) {
            this.f21789I.setColor(aVar.h().intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.f21796P;
            if (aVar2 != null) {
                this.f21789I.setColor(aVar2.h().intValue());
            } else {
                this.f21789I.setColor(h4.f21569h);
            }
        }
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar3 = this.f21799S;
        if (aVar3 != null) {
            this.f21790J.setColor(aVar3.h().intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar4 = this.f21798R;
            if (aVar4 != null) {
                this.f21790J.setColor(aVar4.h().intValue());
            } else {
                this.f21790J.setColor(h4.f21570i);
            }
        }
        if (this.f21758v.h() == null) {
            intValue = 100;
        } else {
            intValue = this.f21758v.h().h().intValue();
        }
        int i5 = (intValue * 255) / 100;
        this.f21789I.setAlpha(i5);
        this.f21790J.setAlpha(i5);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar5 = this.f21801U;
        if (aVar5 != null) {
            this.f21790J.setStrokeWidth(aVar5.h().floatValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar6 = this.f21800T;
            if (aVar6 != null) {
                this.f21790J.setStrokeWidth(aVar6.h().floatValue());
            } else {
                this.f21790J.setStrokeWidth(h4.f21571j * com.airbnb.lottie.utils.j.e() * com.airbnb.lottie.utils.j.g(matrix));
            }
        }
        if (this.f21794N.J0()) {
            W(h4, matrix, bVar, canvas);
        } else {
            X(h4, bVar, canvas);
        }
        canvas.restore();
    }
}
