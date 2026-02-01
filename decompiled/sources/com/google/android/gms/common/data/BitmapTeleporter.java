package com.google.android.gms.common.data;

import K0.c;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@c.a(creator = "BitmapTeleporterCreator")
@D
@I0.a
/* loaded from: classes.dex */
public class BitmapTeleporter extends K0.a implements ReflectedParcelable {

    @I0.a
    @N
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new m();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28507E;

    /* renamed from: F, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(id = 2)
    ParcelFileDescriptor f28508F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(id = 3)
    final int f28509G;

    /* renamed from: H, reason: collision with root package name */
    @P
    private Bitmap f28510H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f28511I;

    /* renamed from: J, reason: collision with root package name */
    private File f28512J;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public BitmapTeleporter(@c.e(id = 1) int i4, @c.e(id = 2) ParcelFileDescriptor parcelFileDescriptor, @c.e(id = 3) int i5) {
        this.f28507E = i4;
        this.f28508F = parcelFileDescriptor;
        this.f28509G = i5;
        this.f28510H = null;
        this.f28511I = false;
    }

    private static final void i0(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e4) {
            Log.w("BitmapTeleporter", "Could not close stream", e4);
        }
    }

    @P
    @I0.a
    public Bitmap c0() {
        if (!this.f28511I) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) C1285y.l(this.f28508F)));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    int readInt = dataInputStream.readInt();
                    int readInt2 = dataInputStream.readInt();
                    Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                    dataInputStream.read(bArr);
                    i0(dataInputStream);
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                    createBitmap.copyPixelsFromBuffer(wrap);
                    this.f28510H = createBitmap;
                    this.f28511I = true;
                } catch (IOException e4) {
                    throw new IllegalStateException("Could not read from parcel file descriptor", e4);
                }
            } catch (Throwable th) {
                i0(dataInputStream);
                throw th;
            }
        }
        return this.f28510H;
    }

    @I0.a
    public void e0(@N File file) {
        if (file != null) {
            this.f28512J = file;
            return;
        }
        throw new NullPointerException("Cannot set null temp directory");
    }

    @I0.a
    public void release() {
        if (!this.f28511I) {
            try {
                ((ParcelFileDescriptor) C1285y.l(this.f28508F)).close();
            } catch (IOException e4) {
                Log.w("BitmapTeleporter", "Could not close PFD", e4);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i4) {
        if (this.f28508F == null) {
            Bitmap bitmap = (Bitmap) C1285y.l(this.f28510H);
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.f28512J;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.f28508F = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            try {
                                dataOutputStream.writeInt(array.length);
                                dataOutputStream.writeInt(bitmap.getWidth());
                                dataOutputStream.writeInt(bitmap.getHeight());
                                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                                dataOutputStream.write(array);
                            } catch (IOException e4) {
                                throw new IllegalStateException("Could not write into unlinked file", e4);
                            }
                        } finally {
                            i0(dataOutputStream);
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e5) {
                    throw new IllegalStateException("Could not create temporary file", e5);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28507E);
        K0.b.S(parcel, 2, this.f28508F, i4 | 1, false);
        K0.b.F(parcel, 3, this.f28509G);
        K0.b.b(parcel, a4);
        this.f28508F = null;
    }

    @I0.a
    public BitmapTeleporter(@N Bitmap bitmap) {
        this.f28507E = 1;
        this.f28508F = null;
        this.f28509G = 0;
        this.f28510H = bitmap;
        this.f28511I = true;
    }
}
