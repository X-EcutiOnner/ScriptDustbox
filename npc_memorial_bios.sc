moro_cav.gat,45,60,5	script	�������� #sara	419,{/* 65379 */
	if(!(checkquest(15006) & 0x8)) {
	}
	mes "[��������]";
	mes "���F����̓����͔��Ɋ댯�ł��B";
	mes "�K���p�[�e�B�[��g��ł���";
	mes "�������s���Ă��������B";
	mes "��낵�����肢���܂��I";
	close;
}
moro_cav.gat,50,63,5	script	���F����#bios	844,{/* 65380 */
	if(!(checkquest(15006) & 0x8)) {
		mes "[��������]";
		mes "�����̓����N������h���A���R��";
		mes "�őO���ł��B";
		mes "���͒������ɂ�蔭�����ꂽ";
		mes "^ff0000���F����^000000�̒������s���Ă��܂��B";
		next;
		mes "[��������]";
		mes "�������A���F����̓����ɂ�";
		mes "���͂ȃ����X�^�[���������Ă���";
		mes "���������r��Ȕ�Q��";
		mes "�󂯂Ă��܂��܂����c�c�B";
		next;
		mes "[��������]";
		mes "�����͑��s���Ȃ���΂Ȃ�܂���";
		mes "����l�̗͂ł͒������s�Ȃ��܂���B";
		next;
		mes "[��������]";
		mes "�����ŁA�r�̗��ł��낤";
		mes "�`���҂̕��X�ɂ���`����";
		mes "���肢���Ă���̂ł��B";
		next;
		mes "[��������]";
		mes "���肢���܂��I";
		mes "���F����̓����̒�����";
		mes "���͂��Ă��������I";
		next;
		menu "���͂���",-;
		mes "[��������]";
		mes "���肪�Ƃ��������܂��I";
		mes "���F����̓����͔��Ɋ댯�ł��B";
		mes "�K���p�[�e�B�[��g��ł���";
		mes "�������s���Ă��������B";
		mes "��낵�����肢���܂��I";
		setquest 15006; //state=1
		compquest 15006;
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "^ff0000�]���̐�ɐi�ނɂ̓p�[�e�B�[��";
		mes "�@�������Ă���K�v������]^000000";
		close;
	}
	if(checkquest(15005) & 0x2) {
		delquest 15005;
		delquest 15007;
	}
	set '@party$,getpartyname(getcharid(1));
	set '@leader$,getpartyleader(getcharid(1));
	mes "�]���F���킪����]";
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		set '@str1$,"���F����ւ̓����J��";
		set '@str2$,"���F����ɓ���";
	}
	else {
		set '@str2$,"���F����ɓ���";
	}
	next;
	switch(select('@str1$,'@str2$,"�L�����Z��")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�p�[�e�B�[���F" +'@party$;
			mes "�p�[�e�B�[���[�_�[�F" +'@leader$;
			mes "^0000ffbios_island ^000000�|�\�񎸔s";
			close;
		}
		mdcreate "bios_island";
		mes "^ff0000�]�������A���_���W������^000000";
		mes "^ff0000�@��������܂����B^000000";
		mes "^ff0000�@�ēx�N���b�N����^000000";
		mes "^ff0000�@����������ĉ������]^000000";
		close;
	case 2:
		switch(mdenter("bios_island")) {
		case 0:	// �G���[�Ȃ�
			announce "�������A���_���W����[bios_island] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")", 0x1, 0x00ff99, 0x190, 12, 0, 0;
			setquest 96430; //state=1
			setquest 15005; //state=1
			setquest 15007; //state=1
			//if(!(checkquest(116535) & 0x8)) { // 2�T��??
				setquest 116535; //state=1
				compquest 116535;
			//}
			close2;
			warp "1@dth1.gat",17,93;
			end;
		case 1:	// �p�[�e�B�[������
			mes "�]�p�[�e�B�[���̂݁A";
			mes "�@�������A���_���W������";
			mes "�@���ꂷ�邱�Ƃ��ł��܂��]";
			close;
		case 2:	// �_���W�������쐬
			mes "�]�p�[�e�B�[���[�_�[��";
			mes "�@�������A���_���W������";
			mes "�@�������Ă��Ȃ���Ԃł��]";
			close;
		default:	// ���̑��G���[
			close;
		}
	case 3:
		mes "�]���F���킩�痣�ꂽ�]";
		close;
	}
OnInit:
	waitingroom "�r�I�X�̓�", 20; //65380
	end;
}


1@dth1.gat,84,90,0	script	#BARRICADE1_1	1905,{/* 69830 */}
1@dth1.gat,84,91,0	script	#BARRICADE1_2	1905,{/* 69831 */}
1@dth1.gat,84,92,0	script	#BARRICADE1_3	1905,{/* 69832 */}
1@dth1.gat,84,93,0	script	#BARRICADE1_4	1905,{/* 69833 */}
1@dth1.gat,84,94,0	script	#BARRICADE1_5	1905,{/* 69834 */}
1@dth1.gat,84,95,0	script	#BARRICADE1_6	1905,{/* 69835 */}
1@dth1.gat,84,96,0	script	#BARRICADE1_7	1905,{/* 69836 */}
1@dth1.gat,84,97,0	script	#BARRICADE1_8	1905,{/* 69837 */}

1@dth1.gat,71,97,3	script	�W�F�C�X#bios1	467,{/* 69839 */
	mes "[�W�F�C�X]";
	mes "�c�c�W�F�C�X���B";
	next;
	mes "[�W�F�C�X]";
	mes "�c�c�B";
	close;
}
1@dth1.gat,74,94,3	script	���_�A���N#bios1	3029,{/* 69840 (hide)*/}
1@dth1.gat,67,97,5	script	�u���h#bios1	468,{/* 69841 */
	mes "[�u���h]";
	mes "���̓u���h�B";
	mes "���������N�̕�����";
	mes "�j�~���ɗ����񂾁B";
	close;
}
1@dth1.gat,67,97,0	script	#��b�p�_�~�[1	139,{/* 69842 (hide)*/}
1@dth1.gat,60,96,5	script	�i�ߊ��A�W�t#bios1	459,{/* 69843 (hide)*/}
1@dth1.gat,60,93,5	script	�������C�O���h#bios1	751,{/* 69844 (hide)*/}
1@dth1.gat,60,96,5	script	�L�h#bios1	884,{/* 69845 (hide)*/}
1@dth1.gat,60,93,5	script	���[��#bios1	885,{/* 69846 (hide)*/}
1@dth1.gat,60,96,5	script	�A���R������#bios1	754,{/* 69847 (hide)*/}
1@dth1.gat,60,93,5	script	�����[�X��#bios1	748,{/* 69848 (hide)*/}
1@dth1.gat,58,95,5	script	�q���[#bios1	868,{/* 69849 (hide)*/}
1@dth1.gat,58,92,5	script	�w���W�k#bios1	931,{/* 69850 (hide)*/}
1@dth1.gat,60,96,5	script	�q�V�G#bios1	623,{/* 69851 (hide)*/}
1@dth1.gat,60,93,5	script	�G�C���@���g#bios1	618,{/* 69852 (hide)*/}
1@dth1.gat,60,96,5	script	��b�w�X�����^#bios1	451,{/* 69853 (hide)*/}
1@dth1.gat,60,93,5	script	�攭�����A�o�����`�F#bi	450,{/* 69854 (hide)*/}
1@dth1.gat,67,97,0	script	#��b�p�_�~�[2	139,{/* 69855 (hide)*/}

1@dth1.gat,326,103,0	script	warp1#bios1	45,{/* 69858 */
setquest 116535; //state=1
compquest 116535;
}

1@dth2.gat,150,126,0	script	#BARRICADE2_1	1905,{/* 69859 */}
1@dth2.gat,150,127,0	script	#BARRICADE2_2	1905,{/* 69860 */}
1@dth2.gat,150,128,0	script	#BARRICADE2_3	1905,{/* 69861 */}
1@dth2.gat,150,129,0	script	#BARRICADE2_4	1905,{/* 69862 */}
1@dth2.gat,150,130,0	script	#BARRICADE2_5	1905,{/* 69863 */}
1@dth2.gat,150,131,0	script	#BARRICADE2_6	1905,{/* 69864 */}
1@dth2.gat,150,132,0	script	#BARRICADE2_7	1905,{/* 69865 */}
1@dth2.gat,150,133,0	script	#BARRICADE2_8	1905,{/* 69866 */}
1@dth2.gat,67,97,0	script	start1#bios2	139,{/* 69869 (hide)*/}
1@dth2.gat,67,97,0	script	BC�p#bios2	139,{/* 69870 */}
1@dth2.gat,326,103,0	script	warp1#bios2	45,{/* 69873 */}

1@dth3.gat,62,80,3	script	���҂̃I�[�N�]���r#1bio	3016,{/* 69874 (hide)*/}
1@dth3.gat,64,80,3	script	���҂̃I�[�N�]���r#2bio	3016,{/* 69875 (hide)*/}
1@dth3.gat,66,80,3	script	���҂̃I�[�N�]���r#3bio	3016,{/* 69876 (hide)*/}
1@dth3.gat,68,80,3	script	���҂̃I�[�N�]���r#4bio	3016,{/* 69877 (hide)*/}
1@dth3.gat,72,80,3	script	���҂̃I�[�N�]���r#5bio	3016,{/* 69878 (hide)*/}
1@dth3.gat,74,80,3	script	���҂̃I�[�N�]���r#6bio	3016,{/* 69879 (hide)*/}
1@dth3.gat,76,80,3	script	���҂̃I�[�N�]���r#7bio	3016,{/* 69880 (hide)*/}
1@dth3.gat,78,80,3	script	���҂̃I�[�N�]���r#8bio	3016,{/* 69881 (hide)*/}
1@dth3.gat,62,86,3	script	���҂̃I�[�N�]���r#1bio	3016,{/* 69882 (hide)*/}
1@dth3.gat,64,86,3	script	���҂̃I�[�N�]���r#2bio	3016,{/* 69883 (hide)*/}
1@dth3.gat,66,86,3	script	���҂̃I�[�N�]���r#3bio	3016,{/* 69884 (hide)*/}
1@dth3.gat,68,86,3	script	���҂̃I�[�N�]���r#4bio	3016,{/* 69885 (hide)*/}
1@dth3.gat,72,86,3	script	���҂̃I�[�N�]���r#5bio	3016,{/* 69886 (hide)*/}
1@dth3.gat,74,86,3	script	���҂̃I�[�N�]���r#6bio	3016,{/* 69887 (hide)*/}
1@dth3.gat,76,86,3	script	���҂̃I�[�N�]���r#7bio	3016,{/* 69888 (hide)*/}
1@dth3.gat,78,86,3	script	���҂̃I�[�N�]���r#8bio	3016,{/* 69889 (hide)*/}
1@dth3.gat,62,92,3	script	���҂̃I�[�N�]���r#1bio	3016,{/* 69890 (hide)*/}
1@dth3.gat,64,92,3	script	���҂̃I�[�N�]���r#2bio	3016,{/* 69891 (hide)*/}
1@dth3.gat,66,92,3	script	���҂̃I�[�N�]���r#3bio	3016,{/* 69892 (hide)*/}
1@dth3.gat,68,92,3	script	���҂̃I�[�N�]���r#4bio	3016,{/* 69893 (hide)*/}
1@dth3.gat,72,92,3	script	���҂̃I�[�N�]���r#5bio	3016,{/* 69894 (hide)*/}
1@dth3.gat,74,92,3	script	���҂̃I�[�N�]���r#6bio	3016,{/* 69895 (hide)*/}
1@dth3.gat,76,92,3	script	���҂̃I�[�N�]���r#7bio	3016,{/* 69896 (hide)*/}
1@dth3.gat,78,92,3	script	���҂̃I�[�N�]���r#8bio	3016,{/* 69897 (hide)*/}

1@dth3.gat,72,74,3	script	�W�F�C�X#bios3	467,{/* 69899 */
	{
		mes "[�W�F�C�X]";
		mes "�c�c�������������B";
		mes "�������Ő[���̂悤���B";
		close;
	}
	{
		mes "[�W�F�C�X]";
		mes "�����A�̂��c�c�B";
		close;
	}
	mes "[�W�F�C�X]";
	mes "�c�c�ǂ���牴�����́A";
	mes "�����̗͂��ߐM���Ă����悤���B";
	next;
	mes "[�W�F�C�X]";
	mes "�c�c�������Ŗ��E����������B";
	mes "���肪�Ƃ��B";
	close;
}
1@dth3.gat,70,67,3	script	���_�A���N#bios3	3029,{/* 69900 (hide)*/}
1@dth3.gat,64,74,5	script	�u���h#bios3	468,{/* 69901 */
	{
	}
	{
		mes "[�u���h]";
		mes "�����A�̂��c�c�I";
		mes "�����܂Łc�c�Ȃ̂��c�c�I";
		close;
	}
	mes "[�u���h]";
	mes "���܂Ȃ��ȁA����������B";
	mes "���������ŏE��������";
	mes "^ff0000�E�҂̏�^000000��";
	mes "�N�ɂ������������A�C�e�����B";
	mes "����󂯎���Ă���B";
	next;
	mes "[�u���h]";
	mes "�����A�������̋C���̈����ꏊ����";
	mes "�o�悤��!!";
	close2;
	delquest 96430;
	getexp 998144,0; //99999999
	getexp 0,3600000; //21593386
	setquest 116513; //state=1
	delquest 116513;
	getitem 6684, 1;
	setquest 201720; //state=1
	warp "moro_cav.gat",45,63;
	end;
}
1@dth3.gat,66,72,0	script	#��������p1	139,{/* 69905 (hide)*/}
1@dth3.gat,66,72,0	script	#talkshow�Ǘ�	139,{/* 69906 */}
1@dth3.gat,66,72,5	script	�i�ߊ��A�W�t#bios3	459,{/* 69907 (hide)*/
	{
		cutin "ep13_captin_edq.bmp", 2;
		mes "[�A�W�t]";
		mes "�C�O���h�I";
		mes "��C�ɏ��������߂邼�I";
		close2;
		cutin "ep13_captin_edq.bmp", 255;
		end;
	}
	{
		mes "�]�A�W�t�͐Ή����Ă���]";
		close;
	}
	cutin "ep13_captin_edq.bmp", 2;
	mes "[�A�W�t]";
	mes "�i�ߊ��̎d������������";
	mes "�r���݂����܂������c�c�B";
	next;
	mes "[�A�W�t]";
	mes "���������͂����܂ł݂������B";
	mes "�i�ߊ��������ԁA���_�𗯎��";
	mes "����킯�ɂ������Ȃ����ȁB";
	next;
	mes "[�A�W�t]";
	mes strcharinfo(0)+ "�B";
	mes "���Ƃ͔C�������B";
	mes "��������P�����Ă����B";
	close2;
	cutin "ep13_captin_edq.bmp", 255;
	end;
}
1@dth3.gat,66,72,5	script	�L�h#bios3	884,{/* 69908 (hide)*/}
1@dth3.gat,66,72,5	script	�q�V�G#bios3	623,{/* 69909 (hide)*/}
1@dth3.gat,66,72,5	script	��b�w�X�����^#bios3	451,{/* 69910 (hide)*/}
1@dth3.gat,70,72,3	script	�������C�O���h#bios3	751,{/* 69911 (hide)*/
	{
		mes "[�C�O���h]";
		mes "�ɒB�ɗb���͂���ĂȂ����I";
		mes "���̈ꌂ�A�H�炢�ȁI";
		close;
	}
	{
		mes "�]�C�O���h�͐Ή����Ă���]";
		close;
	}
	mes "[�C�O���h]";
	mes "�ǂ����Z�M�́B";
	mes "���_�ɖ߂�炵���ȁB";
	next;
	mes "[�C�O���h]";
	mes "�����H";
	mes "���͂����������ꏏ�ɍs�����B";
	mes "���̎��_�������Ă����Ȃ����ȁB";
	next;
	mes "[�C�O���h]";
	mes "�Z�M�̕�����������키����";
	mes "����ɂ��Ă����ȁI";
	close;
}
1@dth3.gat,70,72,3	script	���[��#bios3	885,{/* 69912 (hide)*/}
1@dth3.gat,70,72,3	script	�G�C���@���g#bios3	618,{/* 69913 (hide)*/}
1@dth3.gat,70,72,3	script	�攭�����A�o�����`�F#bi	450,{/* 69914 (hide)*/}

1@dth3.gat,69,67,0	script	freeze#bios3	139,{/* 69916 (hide)*/}
