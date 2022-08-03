apply_patches:
	cd poky/build; \
	cp ../../patches/xfce-desktop-image.bb ../meta/recipes-graphics/images/; \
	cp ../../patches/rockpi-4b-rk3399.conf ../meta-radxa/conf/machine/; \
	rm -f ../meta-radxa/recipes-kernel/linux/linux-*.bb; \
	rm -f ../meta-radxa/recipes-kernel/cypress-backports/brcmfmac.bb; \
	cp -rf ../../patches/recipes-graphics ../meta-radxa/; \
	cp ../../patches/linux-rockpi-4_4.4.bb ../meta-radxa/recipes-kernel/linux/; \
	cp ../../patches/bblayers.conf ./conf/; \
	cp ../../patches/local.conf ./conf/
