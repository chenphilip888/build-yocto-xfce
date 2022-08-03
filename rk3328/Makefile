get_kernel:
	cd kernel.git; \
	cp ../kernelpatches/fireflyrk3328_linux_defconfig ./arch/arm64/configs/; \
	cp ../kernelpatches/rk3328-roc-cc.dts ./arch/arm64/boot/dts/rockchip/; \
	cp ../kernelpatches/rk3328.dtsi ./arch/arm64/boot/dts/rockchip/; \
	cp ../kernelpatches/rk3328-box-plus-dram-timing.dtsi ./arch/arm64/boot/dts/rockchip/; \
	cp ../kernelpatches/rk3328-dram-default-timing.dtsi ./arch/arm64/boot/dts/rockchip/; \
	cp ../kernelpatches/Makefile ./arch/arm64/boot/dts/rockchip/; \
	git init; \
	git add * ; \
	git commit -m "initial release"; \
	git status; \
	git remote add origin https://github.com/radxa/kernel.git

apply_patches:
	cd poky/build; \
	cp -r ../../patches/meta-custom ../; \
	cp ../../patches/xfce-desktop-image.bb ../meta/recipes-graphics/images/; \
	rm -rf ../meta-radxa/recipes-bsp/u-boot/; \
	cp -r ../../patches/u-boot ../meta-radxa/recipes-bsp/; \
	cp -r ../../patches/recipes-graphics ../meta-radxa/; \
	cp ../../patches/linux-rockpi-4_4.4.bb ../meta-radxa/recipes-kernel/linux/; \
	cp ../../patches/evb-rk3328.conf ../meta-radxa/conf/machine/; \
	cp ../../patches/bblayers.conf ./conf/; \
	cp ../../patches/local.conf ./conf/
