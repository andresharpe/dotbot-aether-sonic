package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;
import kotlin.H0;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class D {

    /* loaded from: classes.dex */
    public static final class a implements ImageDecoder$OnHeaderDecodedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X2.q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, H0> f12396a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(X2.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, H0> qVar) {
            this.f12396a = qVar;
        }

        public final void onHeaderDecoded(@l3.d ImageDecoder decoder, @l3.d ImageDecoder.ImageInfo info, @l3.d ImageDecoder.Source source) {
            kotlin.jvm.internal.F.p(decoder, "decoder");
            kotlin.jvm.internal.F.p(info, "info");
            kotlin.jvm.internal.F.p(source, "source");
            this.f12396a.z(decoder, info, source);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ImageDecoder$OnHeaderDecodedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X2.q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, H0> f12397a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(X2.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, H0> qVar) {
            this.f12397a = qVar;
        }

        public final void onHeaderDecoded(@l3.d ImageDecoder decoder, @l3.d ImageDecoder.ImageInfo info, @l3.d ImageDecoder.Source source) {
            kotlin.jvm.internal.F.p(decoder, "decoder");
            kotlin.jvm.internal.F.p(info, "info");
            kotlin.jvm.internal.F.p(source, "source");
            this.f12397a.z(decoder, info, source);
        }
    }

    @l3.d
    @androidx.annotation.W(28)
    public static final Bitmap a(@l3.d ImageDecoder.Source source, @l3.d X2.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, H0> action) {
        Bitmap decodeBitmap;
        kotlin.jvm.internal.F.p(source, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        decodeBitmap = ImageDecoder.decodeBitmap(source, A.a(new a(action)));
        kotlin.jvm.internal.F.o(decodeBitmap, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeBitmap;
    }

    @l3.d
    @androidx.annotation.W(28)
    public static final Drawable b(@l3.d ImageDecoder.Source source, @l3.d X2.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, H0> action) {
        Drawable decodeDrawable;
        kotlin.jvm.internal.F.p(source, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        decodeDrawable = ImageDecoder.decodeDrawable(source, A.a(new b(action)));
        kotlin.jvm.internal.F.o(decodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeDrawable;
    }
}
