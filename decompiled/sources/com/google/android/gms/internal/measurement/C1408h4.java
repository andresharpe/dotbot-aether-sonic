package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1440l4;
import com.google.android.gms.internal.measurement.C1408h4;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.h4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1408h4<MessageType extends AbstractC1440l4<MessageType, BuilderType>, BuilderType extends C1408h4<MessageType, BuilderType>> extends AbstractC1510u3<MessageType, BuilderType> {

    /* renamed from: E, reason: collision with root package name */
    private final AbstractC1440l4 f29663E;

    /* renamed from: F, reason: collision with root package name */
    protected AbstractC1440l4 f29664F;

    /* renamed from: G, reason: collision with root package name */
    protected boolean f29665G = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1408h4(MessageType messagetype) {
        this.f29663E = messagetype;
        this.f29664F = (AbstractC1440l4) messagetype.y(4, null, null);
    }

    private static final void l(AbstractC1440l4 abstractC1440l4, AbstractC1440l4 abstractC1440l42) {
        X4.a().b(abstractC1440l4.getClass()).zzg(abstractC1440l4, abstractC1440l42);
    }

    @Override // com.google.android.gms.internal.measurement.Q4
    public final /* synthetic */ P4 b() {
        return this.f29663E;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1510u3
    protected final /* synthetic */ AbstractC1510u3 i(AbstractC1518v3 abstractC1518v3) {
        o((AbstractC1440l4) abstractC1518v3);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1510u3
    public final /* bridge */ /* synthetic */ AbstractC1510u3 j(byte[] bArr, int i4, int i5) throws zzko {
        p(bArr, 0, i5, X3.f29553d);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1510u3
    public final /* bridge */ /* synthetic */ AbstractC1510u3 k(byte[] bArr, int i4, int i5, X3 x3) throws zzko {
        p(bArr, 0, i5, x3);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1510u3
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final C1408h4 clone() {
        C1408h4 c1408h4 = (C1408h4) this.f29663E.y(5, null, null);
        c1408h4.o(v());
        return c1408h4;
    }

    public final C1408h4 o(AbstractC1440l4 abstractC1440l4) {
        if (this.f29665G) {
            s();
            this.f29665G = false;
        }
        l(this.f29664F, abstractC1440l4);
        return this;
    }

    public final C1408h4 p(byte[] bArr, int i4, int i5, X3 x3) throws zzko {
        if (this.f29665G) {
            s();
            this.f29665G = false;
        }
        try {
            X4.a().b(this.f29664F.getClass()).b(this.f29664F, bArr, 0, i5, new C1542y3(x3));
            return this;
        } catch (zzko e4) {
            throw e4;
        } catch (IOException e5) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e5);
        } catch (IndexOutOfBoundsException unused) {
            throw zzko.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType q() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.l4 r0 = r5.v()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.y(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.gms.internal.measurement.X4 r3 = com.google.android.gms.internal.measurement.X4.a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.a5 r3 = r3.b(r4)
            boolean r3 = r3.zzk(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.y(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.gms.internal.measurement.zzmm r1 = new com.google.android.gms.internal.measurement.zzmm
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1408h4.q():com.google.android.gms.internal.measurement.l4");
    }

    @Override // com.google.android.gms.internal.measurement.O4
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public MessageType v() {
        if (this.f29665G) {
            return (MessageType) this.f29664F;
        }
        AbstractC1440l4 abstractC1440l4 = this.f29664F;
        X4.a().b(abstractC1440l4.getClass()).zzf(abstractC1440l4);
        this.f29665G = true;
        return (MessageType) this.f29664F;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
        AbstractC1440l4 abstractC1440l4 = (AbstractC1440l4) this.f29664F.y(4, null, null);
        l(abstractC1440l4, this.f29664F);
        this.f29664F = abstractC1440l4;
    }
}
