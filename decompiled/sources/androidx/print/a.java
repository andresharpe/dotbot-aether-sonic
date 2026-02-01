package androidx.print;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    private static final String f17252g = "PrintHelper";

    /* renamed from: h, reason: collision with root package name */
    private static final int f17253h = 3500;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f17254i = true;

    /* renamed from: j, reason: collision with root package name */
    static final boolean f17255j = true;

    /* renamed from: k, reason: collision with root package name */
    public static final int f17256k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f17257l = 2;

    /* renamed from: m, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f17258m = 1;

    /* renamed from: n, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f17259n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f17260o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f17261p = 2;

    /* renamed from: a, reason: collision with root package name */
    final Context f17262a;

    /* renamed from: b, reason: collision with root package name */
    BitmapFactory.Options f17263b = null;

    /* renamed from: c, reason: collision with root package name */
    final Object f17264c = new Object();

    /* renamed from: d, reason: collision with root package name */
    int f17265d = 2;

    /* renamed from: e, reason: collision with root package name */
    int f17266e = 2;

    /* renamed from: f, reason: collision with root package name */
    int f17267f = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.print.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class AsyncTaskC0161a extends AsyncTask<Void, Void, Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f17268a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PrintAttributes f17269b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f17270c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PrintAttributes f17271d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f17272e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptor f17273f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f17274g;

        AsyncTaskC0161a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i4, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f17268a = cancellationSignal;
            this.f17269b = printAttributes;
            this.f17270c = bitmap;
            this.f17271d = printAttributes2;
            this.f17272e = i4;
            this.f17273f = parcelFileDescriptor;
            this.f17274g = writeResultCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f17268a.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(a.this.f17262a, this.f17269b);
                Bitmap a4 = a.a(this.f17270c, this.f17269b.getColorMode());
                if (this.f17268a.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page startPage = printedPdfDocument.startPage(1);
                    boolean z3 = a.f17255j;
                    if (z3) {
                        rectF = new RectF(startPage.getInfo().getContentRect());
                    } else {
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(a.this.f17262a, this.f17271d);
                        PdfDocument.Page startPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(startPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(startPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    Matrix d4 = a.d(a4.getWidth(), a4.getHeight(), rectF, this.f17272e);
                    if (!z3) {
                        d4.postTranslate(rectF.left, rectF.top);
                        startPage.getCanvas().clipRect(rectF);
                    }
                    startPage.getCanvas().drawBitmap(a4, d4, null);
                    printedPdfDocument.finishPage(startPage);
                    if (this.f17268a.isCanceled()) {
                        printedPdfDocument.close();
                        ParcelFileDescriptor parcelFileDescriptor = this.f17273f;
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (a4 != this.f17270c) {
                            a4.recycle();
                        }
                        return null;
                    }
                    printedPdfDocument.writeTo(new FileOutputStream(this.f17273f.getFileDescriptor()));
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor2 = this.f17273f;
                    if (parcelFileDescriptor2 != null) {
                        try {
                            parcelFileDescriptor2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (a4 != this.f17270c) {
                        a4.recycle();
                    }
                    return null;
                } finally {
                }
            } catch (Throwable th) {
                return th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Throwable th) {
            if (this.f17268a.isCanceled()) {
                this.f17274g.onWriteCancelled();
            } else if (th == null) {
                this.f17274g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                Log.e(a.f17252g, "Error writing printed content", th);
                this.f17274g.onWriteFailed(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(19)
    /* loaded from: classes.dex */
    public class c extends PrintDocumentAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final String f17276a;

        /* renamed from: b, reason: collision with root package name */
        private final int f17277b;

        /* renamed from: c, reason: collision with root package name */
        private final Bitmap f17278c;

        /* renamed from: d, reason: collision with root package name */
        private final b f17279d;

        /* renamed from: e, reason: collision with root package name */
        private PrintAttributes f17280e;

        c(String str, int i4, Bitmap bitmap, b bVar) {
            this.f17276a = str;
            this.f17277b = i4;
            this.f17278c = bitmap;
            this.f17279d = bVar;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            b bVar = this.f17279d;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f17280e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f17276a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f17280e, this.f17277b, this.f17278c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(19)
    /* loaded from: classes.dex */
    public class d extends PrintDocumentAdapter {

        /* renamed from: a, reason: collision with root package name */
        final String f17282a;

        /* renamed from: b, reason: collision with root package name */
        final Uri f17283b;

        /* renamed from: c, reason: collision with root package name */
        final b f17284c;

        /* renamed from: d, reason: collision with root package name */
        final int f17285d;

        /* renamed from: e, reason: collision with root package name */
        PrintAttributes f17286e;

        /* renamed from: f, reason: collision with root package name */
        AsyncTask<Uri, Boolean, Bitmap> f17287f;

        /* renamed from: g, reason: collision with root package name */
        Bitmap f17288g = null;

        /* renamed from: androidx.print.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class AsyncTaskC0162a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CancellationSignal f17290a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f17291b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f17292c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f17293d;

            /* renamed from: androidx.print.a$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C0163a implements CancellationSignal.OnCancelListener {
                C0163a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    d.this.a();
                    AsyncTaskC0162a.this.cancel(false);
                }
            }

            AsyncTaskC0162a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f17290a = cancellationSignal;
                this.f17291b = printAttributes;
                this.f17292c = printAttributes2;
                this.f17293d = layoutResultCallback;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    d dVar = d.this;
                    return a.this.i(dVar.f17283b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onCancelled(Bitmap bitmap) {
                this.f17293d.onLayoutCancelled();
                d.this.f17287f = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!a.f17254i || a.this.f17267f == 0)) {
                    synchronized (this) {
                        mediaSize = d.this.f17286e.getMediaSize();
                    }
                    if (mediaSize != null && mediaSize.isPortrait() != a.g(bitmap)) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                d.this.f17288g = bitmap;
                if (bitmap != null) {
                    this.f17293d.onLayoutFinished(new PrintDocumentInfo.Builder(d.this.f17282a).setContentType(1).setPageCount(1).build(), true ^ this.f17291b.equals(this.f17292c));
                } else {
                    this.f17293d.onLayoutFailed(null);
                }
                d.this.f17287f = null;
            }

            @Override // android.os.AsyncTask
            protected void onPreExecute() {
                this.f17290a.setOnCancelListener(new C0163a());
            }
        }

        d(String str, Uri uri, b bVar, int i4) {
            this.f17282a = str;
            this.f17283b = uri;
            this.f17284c = bVar;
            this.f17285d = i4;
        }

        void a() {
            synchronized (a.this.f17264c) {
                try {
                    a aVar = a.this;
                    if (aVar.f17263b != null) {
                        aVar.f17263b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f17287f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            b bVar = this.f17284c;
            if (bVar != null) {
                bVar.a();
            }
            Bitmap bitmap = this.f17288g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f17288g = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f17286e = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f17288g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f17282a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f17287f = new AsyncTaskC0162a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f17286e, this.f17285d, this.f17288g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    public a(@N Context context) {
        this.f17262a = context;
    }

    static Bitmap a(Bitmap bitmap, int i4) {
        if (i4 != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @W(19)
    private static PrintAttributes.Builder b(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    static Matrix d(int i4, int i5, RectF rectF, int i6) {
        float min;
        Matrix matrix = new Matrix();
        float f4 = i4;
        float width = rectF.width() / f4;
        if (i6 == 2) {
            min = Math.max(width, rectF.height() / i5);
        } else {
            min = Math.min(width, rectF.height() / i5);
        }
        matrix.postScale(min, min);
        matrix.postTranslate((rectF.width() - (f4 * min)) / 2.0f, (rectF.height() - (i5 * min)) / 2.0f);
        return matrix;
    }

    static boolean g(Bitmap bitmap) {
        if (bitmap.getWidth() <= bitmap.getHeight()) {
            return true;
        }
        return false;
    }

    private Bitmap h(Uri uri, BitmapFactory.Options options) throws FileNotFoundException {
        Context context;
        if (uri != null && (context = this.f17262a) != null) {
            InputStream inputStream = null;
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (IOException e4) {
                            Log.w(f17252g, "close fail ", e4);
                        }
                    }
                    return decodeStream;
                } catch (Throwable th) {
                    th = th;
                    inputStream = openInputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e5) {
                            Log.w(f17252g, "close fail ", e5);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
    }

    public static boolean q() {
        return true;
    }

    public int c() {
        return this.f17266e;
    }

    public int e() {
        int i4 = this.f17267f;
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public int f() {
        return this.f17265d;
    }

    Bitmap i(Uri uri) throws FileNotFoundException {
        BitmapFactory.Options options;
        if (uri != null && this.f17262a != null) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            h(uri, options2);
            int i4 = options2.outWidth;
            int i5 = options2.outHeight;
            if (i4 > 0 && i5 > 0) {
                int max = Math.max(i4, i5);
                int i6 = 1;
                while (max > f17253h) {
                    max >>>= 1;
                    i6 <<= 1;
                }
                if (i6 > 0 && Math.min(i4, i5) / i6 > 0) {
                    synchronized (this.f17264c) {
                        options = new BitmapFactory.Options();
                        this.f17263b = options;
                        options.inMutable = true;
                        options.inSampleSize = i6;
                    }
                    try {
                        Bitmap h4 = h(uri, options);
                        synchronized (this.f17264c) {
                            this.f17263b = null;
                        }
                        return h4;
                    } catch (Throwable th) {
                        synchronized (this.f17264c) {
                            this.f17263b = null;
                            throw th;
                        }
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("bad argument to getScaledBitmap");
    }

    public void j(@N String str, @N Bitmap bitmap) {
        k(str, bitmap, null);
    }

    public void k(@N String str, @N Bitmap bitmap, @P b bVar) {
        PrintAttributes.MediaSize mediaSize;
        if (bitmap == null) {
            return;
        }
        PrintManager printManager = (PrintManager) this.f17262a.getSystemService("print");
        if (g(bitmap)) {
            mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
        } else {
            mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
        }
        printManager.print(str, new c(str, this.f17265d, bitmap, bVar), new PrintAttributes.Builder().setMediaSize(mediaSize).setColorMode(this.f17266e).build());
    }

    public void l(@N String str, @N Uri uri) throws FileNotFoundException {
        m(str, uri, null);
    }

    public void m(@N String str, @N Uri uri, @P b bVar) throws FileNotFoundException {
        d dVar = new d(str, uri, bVar, this.f17265d);
        PrintManager printManager = (PrintManager) this.f17262a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f17266e);
        int i4 = this.f17267f;
        if (i4 != 1 && i4 != 0) {
            if (i4 == 2) {
                builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
            }
        } else {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        }
        printManager.print(str, dVar, builder.build());
    }

    public void n(int i4) {
        this.f17266e = i4;
    }

    public void o(int i4) {
        this.f17267f = i4;
    }

    public void p(int i4) {
        this.f17265d = i4;
    }

    @W(19)
    void r(PrintAttributes printAttributes, int i4, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        PrintAttributes build;
        if (f17255j) {
            build = printAttributes;
        } else {
            build = b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build();
        }
        new AsyncTaskC0161a(cancellationSignal, build, bitmap, printAttributes, i4, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}
