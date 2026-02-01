package p2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: p2.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2393d {
    public static void a(String str, String str2) throws Exception {
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        String canonicalPath = new File(str2).getCanonicalPath();
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                if (new File(str2, nextEntry.getName()).getCanonicalPath().startsWith(canonicalPath)) {
                    String name = nextEntry.getName();
                    if (!name.startsWith("__MACOSX")) {
                        if (nextEntry.isDirectory()) {
                            new File(str2 + File.separator + name.substring(0, name.length() - 1)).mkdirs();
                        } else {
                            File file = new File(str2 + File.separator + name);
                            file.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                fileOutputStream.flush();
                            }
                            fileOutputStream.close();
                        }
                    }
                } else {
                    throw new SecurityException();
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }
}
