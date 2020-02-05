# ref: http://lists.openembedded.org/pipermail/openembedded-core/2019-September/287049.html
#
# adding devrandom prevents openssl from using getrandom() which is not available on older glibc versions
# (native versions can be built with newer glibc, but then relocated onto a system with older glibc)
# Without os seed, in virtual machine build environment, OpenSSL is not initialized properly due to entropy shortage 
EXTRA_OECONF_class-native = "--with-rand-seed=os,devrandom"
EXTRA_OECONF_class-nativesdk = "--with-rand-seed=os,devrandom"
