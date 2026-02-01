package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f15891a = versionedParcel.M(audioAttributesImplBase.f15891a, 1);
        audioAttributesImplBase.f15892b = versionedParcel.M(audioAttributesImplBase.f15892b, 2);
        audioAttributesImplBase.f15893c = versionedParcel.M(audioAttributesImplBase.f15893c, 3);
        audioAttributesImplBase.f15894d = versionedParcel.M(audioAttributesImplBase.f15894d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.M0(audioAttributesImplBase.f15891a, 1);
        versionedParcel.M0(audioAttributesImplBase.f15892b, 2);
        versionedParcel.M0(audioAttributesImplBase.f15893c, 3);
        versionedParcel.M0(audioAttributesImplBase.f15894d, 4);
    }
}
