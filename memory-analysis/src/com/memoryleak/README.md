Include these in jvm arguments:

-Xmx512m -Xlog:gc*=debug:file=<path-to-gclog>\LEAK\gc.log  -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=<path-to-dumpfile>\oom.hprof
