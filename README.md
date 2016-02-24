# Testing of extracting zipx files

zipx is a format defined by winzip (http://kb.winzip.com/kb/entry/7/). 

The zipx file format supports various compression methods (e.g. BZip, LZMA, PPMd, Jpeg and Wavpack etc.).

When a zipx file is created, winzip choses the best compression method (as per its default setting) depending on its content. For example if the content contains photos, it will probably chose jpeg compression method.

This project represents that a zipx file created with compression method bzip2 can be extracted programmatically with core java api (using java.util.zip.ZipInputStream). However if the compression method is LZMA, the same java program fails. See unit tests.