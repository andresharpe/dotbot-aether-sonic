package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.N;
import androidx.annotation.W;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    private final InternalRewinder f25786a;

    /* JADX INFO: Access modifiers changed from: private */
    @W(21)
    /* loaded from: classes.dex */
    public static final class InternalRewinder {

        /* renamed from: a, reason: collision with root package name */
        private final ParcelFileDescriptor f25787a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f25787a = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f25787a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f25787a;
            } catch (ErrnoException e4) {
                throw new IOException(e4);
            }
        }
    }

    @W(21)
    /* loaded from: classes.dex */
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        @N
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @N
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<ParcelFileDescriptor> b(@N ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @W(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f25786a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return true;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    @N
    @W(21)
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor a() throws IOException {
        return this.f25786a.rewind();
    }
}
