SUMMARY = "PO for anything"
DESCRIPTION = "The po4a (PO for anything) project goal is to ease translations \
(and more interestingly, the maintenance of translations) using gettext tools \
on areas where they were not expected like documentation."
HOMEPAGE = "https://po4a.alioth.debian.org"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=a96fc9b4cc36d80659e694ea109f0325"

SRC_URI = "git://alioth.debian.org/anonscm/git/po4a/po4a.git;protocol=https"

# v0.49
SRCREV = "79ed87a577a543538fe39c7b60079981f5997072"

S = "${WORKDIR}/git"

inherit cpan_build

DEPENDS += "libmodule-build-perl-native"

BBCLASSEXTEND = "native"
