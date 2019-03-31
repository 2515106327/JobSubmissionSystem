package com.cdtu.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/**
 * 递归压缩方法
 * 
 * @param sourceFile
 *            源文件
 * @param zos
 *            zip输出流
 * @param name
 *            压缩后的名称
 * @param KeepDirStructure
 *            是否保留原来的目录结构,true:保留目录结构;
 *            false:所有文件跑到压缩包根目录下(注意：不保留目录结构可能会出现同名文件,会压缩失败)
 * @throws Exception
 */
public class compresszip {
	public static void compress(File sourceFile, ZipOutputStream zos, String name, boolean KeepDirStructure)
	            throws Exception {
	        byte[] buf = new byte[1024];
	        if (sourceFile.isFile()) {
	            // 向zip输出流中添加一个zip实体，构造器中name为zip实体的文件的名字
	            zos.putNextEntry(new ZipEntry(name));
	            // copy文件到zip输出流中
	            int len;
	            FileInputStream in = new FileInputStream(sourceFile);
	            while ((len = in.read(buf)) != -1) {
	                zos.write(buf, 0, len);
	            }
	            // Complete the entry
	            zos.closeEntry();
	            in.close();
	        } else {
	            File[] listFiles = sourceFile.listFiles();// listFiles是获取该目录下所有文件和目录的绝对路径
	            if (listFiles == null || listFiles.length == 0) {
	                // 需要保留原来的文件结构时,需要对空文件夹进行处理
	                if (KeepDirStructure) {
	                    // 空文件夹的处理
	                    zos.putNextEntry(new ZipEntry(name + "/"));
	                    // 没有文件，不需要文件的copy
	                    zos.closeEntry();//关闭当前zip条目读取下一条
	                }

	            } else {
	                for (File file : listFiles) {
	                    // 判断是否需要保留原来的文件结构
	                    if (KeepDirStructure) {
	                        // 注意：file.getName()前面需要带上父文件夹的名字加一斜杠,
	                        // 不然最后压缩包中就不能保留原来的文件结构,即：所有文件都跑到压缩包根目录下了
	                        compress(file, zos, name + "/" + file.getName(), KeepDirStructure);
	                    } else {
	                        compress(file, zos, file.getName(), KeepDirStructure);
	                    }

	                }
	            }
	        }
	    }
}
