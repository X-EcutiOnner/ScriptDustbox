@spawn(type: BL_MOB, ID: 36433, speed: 150, option: 0, view: 3010, pos: "dali.gat"(138, 132), dir: 0, name: "���҂̃I�[�N�x�C�r�[")
@spawn(type: BL_MOB, ID: 11528, speed: 150, option: 0, view: 3011, pos: "dali.gat"(145, 107), dir: 0, name: "���҂̎q�f�U�[�g�E���t")
@spawn(type: BL_MOB, ID: 32898, speed: 120, option: 0, view: 3012, pos: "dali.gat"(138, 132), dir: 0, name: "���҂̃}�����X�t�B�A�[")
@spawn(type: BL_MOB, ID: 26291, speed: 150, option: 0, view: 3013, pos: "dali.gat"(103, 124), dir: 0, name: "���҂̃I�[�N�E�H���A�[")
@spawn(type: BL_MOB, ID: 39730, speed: 150, option: 0, view: 3014, pos: "dali.gat"(144, 130), dir: 0, name: "���҂̃f�U�[�g�E���t")
@spawn(type: BL_MOB, ID: 26817, speed: 150, option: 0, view: 3015, pos: "dali.gat"(143, 130), dir: 0, name: "���҂̃t�F��")

moro_cav.gat,45,60,5	script	�������� #sara	419,{/* 65379 */
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
	if(checkquest(15005) == 0 || checkquest(118927) == 0) {
		mes "�]���̐�͓��ꂵ�Ă���1��ڂ�";
		mes "�@^ff0000�ߑO5���ȍ~^000000�ɐi�s�\�ł��B";
		mes "�@�A���A�Ō�̓�������Ă���";
		mes "�@^ff00001����^000000�o�߂���܂ł�";
		mes "�@�i�s�ł��܂���̂ł����ӂ��������]";
		close;
	}
	if(checkquest(15005) & 0x2) {
		delquest 15005;
		delquest 15007;
	}
	if(checkquest(118927) & 0x2)
		delquest 118927;
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
			//setquest 118927; //state=1
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
1@dth1.gat,1,1,0	script	#bios1_mobdead	139,{
OnStart:
	hideonnpc getmdnpcname("���_�A���N#bios1");
	hideonnpc getmdnpcname("#��b�p�_�~�[1");
	hideonnpc getmdnpcname("�i�ߊ��A�W�t#bios1");
	hideonnpc getmdnpcname("�������C�O���h#bios1");
	hideonnpc getmdnpcname("�L�h#bios1");
	hideonnpc getmdnpcname("���[��#bios1");
	hideonnpc getmdnpcname("�����[�X��#bios1");
	hideonnpc getmdnpcname("�q���[#bios1");
	hideonnpc getmdnpcname("�w���W�k#bios1");
	hideonnpc getmdnpcname("�q�V�G#bios1");
	hideonnpc getmdnpcname("�G�C���@���g#bios1");
	hideonnpc getmdnpcname("��b�w�X�����^#bios1");
	hideonnpc getmdnpcname("�攭�����A�o�����`�F#b1");

	hideonnpc getmdnpcname("#��b�p�_�~�[2");

	hideonnpc getmdnpcname("warp1#bios2");
	hideonnpc getmdnpcname("���_�A���N#bios3");

	hideonnpc getmdnpcname("�i�ߊ��A�W�t#bios3");
	hideonnpc getmdnpcname("�������C�O���h#bios3");
	hideonnpc getmdnpcname("�L�h#bios3");
	hideonnpc getmdnpcname("���[��#bios3");
	hideonnpc getmdnpcname("�����[�X��#bios3");
	hideonnpc getmdnpcname("�q���[#bios3");
	hideonnpc getmdnpcname("�w���W�k#bios3");
	hideonnpc getmdnpcname("�q�V�G#bios3");
	hideonnpc getmdnpcname("�G�C���@���g#bios3");
	hideonnpc getmdnpcname("��b�w�X�����^#bios3");
	hideonnpc getmdnpcname("�攭�����A�o�����`�F#b3");

	for(set '@i,1; '@i<=3; set '@i,'@i+1) {
		for(set '@j,1; '@j<=8; set '@j,'@j+1)
			hideonnpc getmdnpcname("���҂̃I�[�N�]���r#"+ '@i + '@j +"bi");
	}

	areasetcell getmdmapname("1@dth1.gat"),84,90,85,97,1;
	areasetcell getmdmapname("1@dth2.gat"),150,126,151,133,1;

	set '@map$,getmdmapname("1@dth1.gat");
	set '@label$,getmdnpcname("#bios1_mobdead")+ "::OnKilled";
	monster '@map$,90,94,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,90,94,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,101,125,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,101,125,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,108,156,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,108,156,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,119,59,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,119,144,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,121,69,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,124,164,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,131,101,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,131,101,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,135,50,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,135,152,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,138,132,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,138,132,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,141,143,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,143,49,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,144,164,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,145,107,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,145,107,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,153,76,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,153,76,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,156,46,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,165,84,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,165,130,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,170,67,"���҂̃}�����X�t�B�A�[",3012,2,'@label$;
	monster '@map$,184,130,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,192,145,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,194,116,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,203,131,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,203,151,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,203,162,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,203,162,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,204,112,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,205,98,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,206,169,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,210,62,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,211,88,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,212,75,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,213,151,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,214,53,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,215,109,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,217,129,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,221,166,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,223,72,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,224,62,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,225,103,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,225,54,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,225,89,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,225,152,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,227,150,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,227,150,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,227,150,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,228,124,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,232,87,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,232,69,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,233,57,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,237,80,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,240,140,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,243,106,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,244,119,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,246,71,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,246,126,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,248,81,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,249,144,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,249,155,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,252,105,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	monster '@map$,274,104,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,297,103,"���҂̃}�����X�t�B�A�[",3012,1,'@label$;
	monster '@map$,306,103,"���҂̎q�f�U�[�g�E���t",3011,1,'@label$;
	monster '@map$,316,103,"���҂̃I�[�N�x�C�r�[",3010,1,'@label$;
	end;
OnKilled:
	// ������
	end;
}
1@dth1.gat,71,97,3	script	�W�F�C�X#bios1	467,{/* 69839 */
	mes "[�W�F�C�X]";
	mes "�c�c�W�F�C�X���B";
	next;
	mes "[�W�F�C�X]";
	mes "�c�c�B";
	close;
OnTalk1:
	unittalk "�W�F�C�X : �c�c�W�F�C�X���B";
	end;
OnTalk2:
	unittalk "�W�F�C�X : �c�c";
	end;
OnTalk3:
	unittalk "�W�F�C�X : �c�c�ǂ����Ă���ȂƂ���ɁH";
	end;
OnTalk4:
	unittalk "�W�F�C�X : �c�c!!!�@�N��!?";
	end;
OnTalk5:
	unittalk "�W�F�C�X : �c�c��s����B���Ƃ�����ė��Ă���B";
	end;
}
1@dth1.gat,74,94,3	script	���_�A���N#bios1	3029,{/* 69840 (hide)*/
	end;
OnTalk1:
	unittalk "�H�H�H�H : �N�b�N�b�N�B";
	end;
OnTalk2:
	unittalk "�H�H�H�H : �悤�����r�I�X�̓��ցB";
	end;
OnTalk3:
	unittalk "���_�A���N : ���͎��_�A���N�B�����͎������o�������Ɛ��̋�Ԃł��B";
	end;
OnTalk4:
	unittalk "���_�A���N : ����͂���́A�݂Ȃ���А��������悤�ł��ˁB";
	end;
OnTalk5:
	unittalk "���_�A���N : ���ꂩ�烂���N�l�ɕ����鐶�т𒲒B���悤�Ƃ��Ă����̂ł����c�c�B";
	end;
OnTalk6:
	unittalk "���_�A���N : �܂������т��������ė���Ƃ́c�c�N�N�N�B";
	end;
OnTalk7:
	unittalk "���_�A���N : �����N�l�̗͂ɂȂ�鎖�����h�Ɏv���Ȃ����B";
	end;
OnTalk8:
	unittalk "���_�A���N : �N�N�A�А����ǂ��Č��\�ł��B�����A�}���K�v�͂���܂���B";
	end;
OnTalk9:
	unittalk "���_�A���N : �܂��͎��̐��E�ł������c�c���낮���Ƃł��B�N�N�N�N�N�B";
	end;
}
1@dth1.gat,67,97,5	script	�u���h#bios1	468,{/* 69841 */
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�u���h]";
		mes "���̓u���h�B";
		mes "���������N�̕�����";
		mes "�j�~���ɗ����񂾁B";
		close;
	}
	if(select("����}��","��b������") == 1) {
		mes "�]�N�����Ă���H�]";
		next;
		switch(select("�A�W�t�ƃC�O���h��","�L�h�ƃ��[����","�Z���U���B��","�q�V�G�ƃG�C���@���g��","�w�X�����^�ƃA�o�����`�F��","�N�����Ȃ�")) {
		case 1:
			mes "�]�A�W�t�A�C�O���h�ƍ��������]";
			break;
		}
		close2;
		hideonnpc getmdnpcname("�u���h#bios1"); //71400
		hideonnpc getmdnpcname("�W�F�C�X#bios1"); //71398
		donpcevent getmdnpcname("�W�F�C�X#bios1")+ "::OnStart2";
		end;
	}
	mes "�]������Ȃ��j����l�g������]";
	close2;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�u���h : ����H�@����ȂƂ���Ŗ`���҂ɉ�Ƃ́c�c";
	end;
OnTimer4000:
	unittalk "�u���h : �N�����������N�̕�����j�~���ɗ����̂��H";
	end;
OnTimer7000:
	unittalk "�u���h : ���̓v�����e�����痈���u���h�B�����́c�c";
	end;
OnTimer10000:
	donpcevent getmdnpcname("�W�F�C�X#bios1")+ "::OnTalk1";
	end;
OnTimer13000:
	unittalk "�u���h : ���܂�ȁB�W�F�C�X�͐l���m��Ȃ񂾁B";
	end;
OnTimer16000:
	donpcevent getmdnpcname("�W�F�C�X#bios1")+ "::OnTalk2";
	end;
OnTimer19000:
	unittalk "�u���h : ������A��납��N���ǂ������ė��Ă��邪�A�N�̒m�荇�����H";
	end;
OnTimer20000:
	stopnpctimer;
	hideoffnpc getmdnpcname("#��b�p�_�~�[1");
	end;
OnTalk1:
	unittalk "�u���h : ���񂽂�c�c�A���R�̎i�ߊ��A�W�t�Ƌ������C�O���h���I";
	end;
OnTalk2:
	unittalk "�u���h : ���񂽂炪����Ȃ�S�����I�@��낵�����ނ��I";
	end;
OnTalk3:
	unittalk "�u���h : �Ȃɂ�!!";
	end;
OnTalk4:
	unittalk "�u���h : �͂��I�@�O���ɗp�͂Ȃ��I";
	end;
OnTalk5:
	unittalk "�u���h : �N�����m��񂪁A�܂��͂��O��|���Ă���!!";
	end;
OnTalk6:
	unittalk "�u���h : �������I�@�����₪����!!";
	end;
OnTalk7:
	unittalk "�u���h : ���������������N�𕜊������悤�Ƃ��Ă���̂��H";
	end;
OnTalk8:
	unittalk "�u���h : �z��ǂ����I�@�W�F�C�X�}���I";
	end;
}
1@dth1.gat,67,97,0	script	#��b�p�_�~�[1	139,10,10,{/* 69842 (hide)*/
	mes "�]�N�����Ă���H�]";
	next;
	switch(select("�A�W�t�ƃC�O���h��","�L�h�ƃ��[����","�Z���U���B��","�q�V�G�ƃG�C���@���g��","�w�X�����^�ƃA�o�����`�F��","�N�����Ȃ�")) {
	case 1:
		mes "�]�U������ƁA�A�W�t�ƃC�O���h�������]";
		close2;
		donpcevent getmdnpcname("�i�ߊ��A�W�t#bios1")+ "::OnStart";
		end;
	}
}
1@dth1.gat,60,96,5	script	�i�ߊ��A�W�t#bios1	459,{/* 69843 (hide)*/
	//
	end;
OnStart:
	hideonnpc getmdnpcname("#��b�p�_�~�[1");
	hideoffnpc getmdnpcname("�i�ߊ��A�W�t#bios1");
	hideoffnpc getmdnpcname("�������C�O���h#bios1");
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�A�W�t : �݂�ȁA�������I�@������������ɂ͂������v���I";
	end;
OnTimer4000:
	donpcevent getmdnpcname("�������C�O���h#bios1")+ "::OnTalk1";
	end;
OnTimer7000:
	unittalk "�A�W�t : ���邳���I�@���ƁA���̎��͎i�ߊ��ƌĂׁI";
	end;
OnTimer10000:
	donpcevent getmdnpcname("�u���h#bios1")+ "::OnTalk1";
	end;
OnTimer13000:
	donpcevent getmdnpcname("�W�F�C�X#bios1")+ "::OnTalk3";
	end;
OnTimer16000:
	unittalk "�A�W�t : �����ɂ͎؂肪�����ĂȁB������Ԃ��ɗ����񂾁B";
	end;
OnTimer19000:
	donpcevent getmdnpcname("�������C�O���h#bios1")+ "::OnTalk2";
	end;
OnTimer22000:
	donpcevent getmdnpcname("�u���h#bios1")+ "::OnTalk2";
	end;
OnTimer25000:
	donpcevent getmdnpcname("���_�A���N#bios1")+ "::OnTalk1";
	end;
OnTimer28000:
	donpcevent getmdnpcname("�W�F�C�X#bios1")+ "::OnTalk4";
	end;
OnTimer31000:
	hideoffnpc getmdnpcname("���_�A���N#bios1");
	donpcevent getmdnpcname("���_�A���N#bios1")+ "::OnTalk2";
	end;
OnTimer34000:
	donpcevent getmdnpcname("���_�A���N#bios1")+ "::OnTalk3";
	end;
OnTimer37000:
	donpcevent getmdnpcname("�u���h#bios1")+ "::OnTalk3";
	end;
OnTimer40000:
	unittalk "�A�W�t : �ւ��A�������e�ʂ��B";
	end;
OnTimer43000:
	donpcevent getmdnpcname("�������C�O���h#bios1")+ "::OnTalk3";
	end;
OnTimer46000:
	unittalk "�A�W�t : �S���A�C�𔲂��񂶂�Ȃ����I";
	end;
OnTimer49000:
	donpcevent getmdnpcname("���_�A���N#bios1")+ "::OnTalk4";
	end;
OnTimer52000:
	donpcevent getmdnpcname("���_�A���N#bios1")+ "::OnTalk5";
	end;
OnTimer55000:
	donpcevent getmdnpcname("���_�A���N#bios1")+ "::OnTalk6";
	end;
OnTimer58000:
	donpcevent getmdnpcname("���_�A���N#bios1")+ "::OnTalk7";
	end;
OnTimer61000:
	donpcevent getmdnpcname("�u���h#bios1")+ "::OnTalk4";
	end;
OnTimer64000:
	donpcevent getmdnpcname("�u���h#bios1")+ "::OnTalk5";
	end;
OnTimer67000:
	donpcevent getmdnpcname("���_�A���N#bios1")+ "::OnTalk8";
	end;
OnTimer70000:
	donpcevent getmdnpcname("���_�A���N#bios1")+ "::OnTalk9";
	end;
OnTimer73000:
	hideonnpc getmdnpcname("���_�A���N#bios1");
	donpcevent getmdnpcname("�u���h#bios1")+ "::OnTalk6";
	end;
OnTimer76000:
	donpcevent getmdnpcname("�u���h#bios1")+ "::OnTalk7";
	end;
OnTimer79000:
	donpcevent getmdnpcname("�u���h#bios1")+ "::OnTalk8";
	hideonnpc getmdnpcname("�u���h#bios1");
	end;
OnTimer82000:
	donpcevent getmdnpcname("�W�F�C�X#bios1")+ "::OnTalk5";
	end;
OnTimer83000:
	hideonnpc getmdnpcname("�W�F�C�X#bios1");
	end;
OnTimer86000:
	unittalk "�A�W�t : �C�O���h�I�@���������������I";
	end;
OnTimer89000:
	hideonnpc getmdnpcname("�i�ߊ��A�W�t#bios1"); //79297
	hideonnpc getmdnpcname("�������C�O���h#bios1"); //79298
OnStart2:
	initnpctimer;
	setnpctimer 89500;
	hideonnpc getmdnpcname("#BARRICADE1_1"); //79284
	hideonnpc getmdnpcname("#BARRICADE1_2"); //79285
	hideonnpc getmdnpcname("#BARRICADE1_3"); //79286
	hideonnpc getmdnpcname("#BARRICADE1_4"); //79287
	hideonnpc getmdnpcname("#BARRICADE1_5"); //79288
	hideonnpc getmdnpcname("#BARRICADE1_6"); //79289
	hideonnpc getmdnpcname("#BARRICADE1_7"); //79290
	hideonnpc getmdnpcname("#BARRICADE1_8"); //79291
	areasetcell getmdmapname("1@dth1.gat"),84,90,85,97,0;
	end;
OnTimer92000:
	announce "���_�A���N : ���A����͐�����҂݂̂ɖK��鋰�|�B���ׂĂ͂�������n�܂�̂ł��c�c", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
OnTimer95000:
	stopnpctimer;
	announce "�u���h : �҂ăA���N�I�@�������A���ɓ������悤���ȁB�z��ǂ����I", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
}
1@dth1.gat,60,93,5	script	�������C�O���h#bios1	751,{/* 69844 (hide)*/
	//
	end;
OnTalk1:
	unittalk "�C�O���h : �Z�M�I�@�i�ߊ����O���ɏo��Ȃ�Ăǂ��������肾�I";
	end;
OnTalk2:
	unittalk "�C�O���h : ���������킯������A�����������������s�����ĖႤ���B";
	end;
OnTalk3:
	unittalk "�C�O���h : �������c�c���Ƃ͌��Ⴂ�̋����݂������ȁB";
	end;
}
1@dth1.gat,60,96,5	script	�L�h#bios1	884,{/* 69845 (hide)*/}
1@dth1.gat,60,93,5	script	���[��#bios1	885,{/* 69846 (hide)*/}
1@dth1.gat,60,96,5	script	�A���R������#bios1	754,{/* 69847 (hide)*/}
1@dth1.gat,60,93,5	script	�����[�X��#bios1	748,{/* 69848 (hide)*/}
1@dth1.gat,58,95,5	script	�q���[#bios1	868,{/* 69849 (hide)*/}
1@dth1.gat,58,92,5	script	�w���W�k#bios1	931,{/* 69850 (hide)*/}
1@dth1.gat,60,96,5	script	�q�V�G#bios1	623,{/* 69851 (hide)*/}
1@dth1.gat,60,93,5	script	�G�C���@���g#bios1	618,{/* 69852 (hide)*/}
1@dth1.gat,60,96,5	script	��b�w�X�����^#bios1	451,{/* 69853 (hide)*/}
1@dth1.gat,60,93,5	script	�攭�����A�o�����`�F#b1	450,{/* 69854 (hide)*/}
1@dth1.gat,67,97,0	script	#��b�p�_�~�[2	139,{/* 69855 (hide)*/}

1@dth1.gat,326,103,0	script	warp1#bios1	45,1,1,{/* 69858 */
	setquest 116535; //state=1
	compquest 116535;
	warp getmdmapname("1@dth2.gat"),17,93;
	end;
}

1@dth2.gat,150,126,0	script	#BARRICADE2_1	1905,{/* 69859 */}
1@dth2.gat,150,127,0	script	#BARRICADE2_2	1905,{/* 69860 */}
1@dth2.gat,150,128,0	script	#BARRICADE2_3	1905,{/* 69861 */}
1@dth2.gat,150,129,0	script	#BARRICADE2_4	1905,{/* 69862 */}
1@dth2.gat,150,130,0	script	#BARRICADE2_5	1905,{/* 69863 */}
1@dth2.gat,150,131,0	script	#BARRICADE2_6	1905,{/* 69864 */}
1@dth2.gat,150,132,0	script	#BARRICADE2_7	1905,{/* 69865 */}
1@dth2.gat,150,133,0	script	#BARRICADE2_8	1905,{/* 69866 */}
1@dth2.gat,1,1,0	script	#bios2_mobdead1	139,{
OnStart:
	monster getmdmapname("1@dth2.gat"),145,130,"���҂̃I�[�N�E�H���A�[",3013,5,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),144,130,"���҂̃f�U�[�g�E���t",3014,4,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),143,130,"���҂̃t�F��",3015,4,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),103,124,"���҂̃I�[�N�E�H���A�[",3013,5,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),102,124,"���҂̃f�U�[�g�E���t",3014,3,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),101,124,"���҂̃t�F��",3015,3,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),119,160,"���҂̃I�[�N�E�H���A�[",3013,5,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),118,160,"���҂̃f�U�[�g�E���t",3014,4,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),117,160,"���҂̃t�F��",3015,4,getmdnpcname("#bios2_mobdead1")+ "::OnKilled";
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@dth2.gat"),getmdnpcname("#bios2_mobdead1")+ "::OnKilled");
	if('@count == 10)
		announce "�u���h : �܂�10�C�̃����X�^�[���c���Ă��邼�I", 0x9, 0xffff00, 0x190, 12, 0, 0;
	else if('@count == 5)
		announce "�u���h : �c��̃����X�^�[�͂���5�C�A�����������I", 0x9, 0xffff00, 0x190, 12, 0, 0;
	else if('@count == 1)
		announce "�u���h : �����X�^�[�͂���1�C���B�Ō�܂ŋC�𔲂��ȁI", 0x9, 0xffff00, 0x190, 12, 0, 0;
	else if('@count <= 0) {
		hideonnpc getmdnpcname("#BARRICADE2_1"); //79284
		hideonnpc getmdnpcname("#BARRICADE2_2"); //79285
		hideonnpc getmdnpcname("#BARRICADE2_3"); //79286
		hideonnpc getmdnpcname("#BARRICADE2_4"); //79287
		hideonnpc getmdnpcname("#BARRICADE2_5"); //79288
		hideonnpc getmdnpcname("#BARRICADE2_6"); //79289
		hideonnpc getmdnpcname("#BARRICADE2_7"); //79290
		hideonnpc getmdnpcname("#BARRICADE2_8"); //79291
		areasetcell getmdmapname("1@dth2.gat"),150,126,151,133,0;
		announce "�u���h : �悵�I�@���̕������Ƃ����I�@���Ɉړ����邼�I", 0x9, 0xffff00, 0x190, 12, 0, 0;
		sleep 2500;
		donpcevent getmdnpcname("#bios2_mobdead2")+ "::OnStart";
	}
	end;
}
1@dth2.gat,1,1,0	script	#bios2_mobdead2	139,{
OnStart:
	announce "�u���h : �������I�@���������X�^�[���炯���B�S�ē|�������Ȃ��̂��I", 0x9, 0xffff00, 0x190, 12, 0, 0;
	monster getmdmapname("1@dth2.gat"),203,132,"���҂̃I�[�N�E�H���A�[",3013,5,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),202,132,"���҂̃f�U�[�g�E���t",3014,3,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),201,132,"���҂̃t�F��",3015,3,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),229,126,"���҂̃I�[�N�E�H���A�[",3013,5,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),228,126,"���҂̃f�U�[�g�E���t",3014,4,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),227,126,"���҂̃t�F��",3015,4,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),267,104,"���҂̃I�[�N�E�H���A�[",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),268,104,"���҂̃t�F��",3015,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),269,104,"���҂̃I�[�N�E�H���A�[",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),270,103,"���҂̃f�U�[�g�E���t",3014,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),270,104,"���҂̃t�F��",3015,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),272,102,"���҂̃t�F��",3015,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),273,102,"���҂̃f�U�[�g�E���t",3014,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),273,103,"���҂̃f�U�[�g�E���t",3014,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),274,102,"���҂̃I�[�N�E�H���A�[",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),275,103,"���҂̃t�F��",3015,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),276,103,"���҂̃f�U�[�g�E���t",3014,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),278,105,"���҂̃I�[�N�E�H���A�[",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	monster getmdmapname("1@dth2.gat"),281,104,"���҂̃I�[�N�E�H���A�[",3013,1,getmdnpcname("#bios2_mobdead2")+ "::OnKilled";
	end;
OnKilled:
	// ������
	set '@count,getmapmobs(getmdmapname("1@dth2.gat"),getmdnpcname("#bios2_mobdead2")+ "::OnKilled");
	if('@count == 10)
		announce "�u���h : �܂�10�C�̃����X�^�[���c���Ă��邼�I", 0x9, 0xffff00, 0x190, 12, 0, 0;
	else if('@count == 5)
		announce "�u���h : �c��̃����X�^�[�͂���5�C�A�����������I", 0x9, 0xffff00, 0x190, 12, 0, 0;
	else if('@count == 1)
		announce "�u���h : �����X�^�[�͂���1�C���I", 0x9, 0xffff00, 0x190, 12, 0, 0;
	else if('@count <= 0) {
		announce "�u���h : �悵�A�Еt�������I�@���̓������ɐi�ނ��I", 0x9, 0xffff00, 0x190, 12, 0, 0;
		hideoffnpc getmdnpcname("warp1#bios2"); //79291
	}
	end;
}
1@dth2.gat,67,97,0	script	start1#bios2	139,5,5,{/* 69869 */
	hideonnpc getmdnpcname("start1#bios2"); //90417
	donpcevent getmdnpcname("BC�p#bios2")+ "::OnStart";
	end;
}
1@dth2.gat,67,97,0	script	BC�p#bios2	139,{/* 69870 */
OnStart:
	initnpctimer;
	donpcevent getmdnpcname("#bios2_mobdead")+ "::OnStart";
	announce "�A�W�t : �ӂ�A���̒��x�̓G�A���̑��肶��˂��ȁB", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
OnTimer3000:
	announce "�C�O���h : �������ČZ�M�Ɣw�����킹�Ő���Ă�Ɨb��������v���o����B", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
OnTimer6000:
	announce "���_�A���N : �N�N�N�B�����Ȃ����l�ԁB", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
OnTimer9000:
	announce "���_�A���N : �����̏I���_�Ƃ́A���Ȃ킿�[���B", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
OnTimer12000:
	announce "���_�A���N : �����}���A���{�ւƗ����Ă��܂���", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
OnTimer15000:
	announce "���_�A���N : ����ƈႢ�A�M���̎��������V���l�͌���Ȃ��B", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
OnTimer18000:
	announce "���_�A���N : �����A���ɋ����Ȃ����B�S�����|�ɐ��ߏグ��̂ł��B", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
OnTimer21000:
	announce "���_�A���N : ���|���тƂȂ�A�����N�l�͍Ăѐ��܂�ς��ł��傤�B", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
OnTimer24000:
	stopnpctimer;
	announce "�u���h : �҂񂾃A���N!!�@�������B�܂��͎ז��ȃ����X�^�[�B��S�ē|�����I", 0x9, 0xffff00, 0x190, 12, 0, 0;
	end;
}
1@dth2.gat,326,103,0	script	warp1#bios2	45,{/* 69873 */
	//setquest 116535; //state=1
	//compquest 116535;
	warp getmdmapname("1@dth3.gat"),45,68;
	end;
}

1@dth3.gat,62,80,3	script	���҂̃I�[�N�]���r#11bi	3016,{/* 69874 (hide)*/}
1@dth3.gat,64,80,3	script	���҂̃I�[�N�]���r#12bi	3016,{/* 69875 (hide)*/}
1@dth3.gat,66,80,3	script	���҂̃I�[�N�]���r#13bi	3016,{/* 69876 (hide)*/}
1@dth3.gat,68,80,3	script	���҂̃I�[�N�]���r#14bi	3016,{/* 69877 (hide)*/}
1@dth3.gat,72,80,3	script	���҂̃I�[�N�]���r#15bi	3016,{/* 69878 (hide)*/}
1@dth3.gat,74,80,3	script	���҂̃I�[�N�]���r#16bi	3016,{/* 69879 (hide)*/}
1@dth3.gat,76,80,3	script	���҂̃I�[�N�]���r#17bi	3016,{/* 69880 (hide)*/}
1@dth3.gat,78,80,3	script	���҂̃I�[�N�]���r#18bi	3016,{/* 69881 (hide)*/}
1@dth3.gat,62,86,3	script	���҂̃I�[�N�]���r#21bi	3016,{/* 69882 (hide)*/}
1@dth3.gat,64,86,3	script	���҂̃I�[�N�]���r#22bi	3016,{/* 69883 (hide)*/}
1@dth3.gat,66,86,3	script	���҂̃I�[�N�]���r#23bi	3016,{/* 69884 (hide)*/}
1@dth3.gat,68,86,3	script	���҂̃I�[�N�]���r#24bi	3016,{/* 69885 (hide)*/}
1@dth3.gat,72,86,3	script	���҂̃I�[�N�]���r#25bi	3016,{/* 69886 (hide)*/}
1@dth3.gat,74,86,3	script	���҂̃I�[�N�]���r#26bi	3016,{/* 69887 (hide)*/}
1@dth3.gat,76,86,3	script	���҂̃I�[�N�]���r#27bi	3016,{/* 69888 (hide)*/}
1@dth3.gat,78,86,3	script	���҂̃I�[�N�]���r#28bi	3016,{/* 69889 (hide)*/}
1@dth3.gat,62,92,3	script	���҂̃I�[�N�]���r#31bi	3016,{/* 69890 (hide)*/}
1@dth3.gat,64,92,3	script	���҂̃I�[�N�]���r#32bi	3016,{/* 69891 (hide)*/}
1@dth3.gat,66,92,3	script	���҂̃I�[�N�]���r#33bi	3016,{/* 69892 (hide)*/}
1@dth3.gat,68,92,3	script	���҂̃I�[�N�]���r#34bi	3016,{/* 69893 (hide)*/}
1@dth3.gat,72,92,3	script	���҂̃I�[�N�]���r#35bi	3016,{/* 69894 (hide)*/}
1@dth3.gat,74,92,3	script	���҂̃I�[�N�]���r#36bi	3016,{/* 69895 (hide)*/}
1@dth3.gat,76,92,3	script	���҂̃I�[�N�]���r#37bi	3016,{/* 69896 (hide)*/}
1@dth3.gat,78,92,3	script	���҂̃I�[�N�]���r#38bi	3016,{/* 69897 (hide)*/}

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
	compquest 116513;
	getitem 6684, 1;
	setquest 201720; //state=1
	warp "moro_cav.gat",45,63;
	end;
}
1@dth3.gat,66,72,0	script	#��������p1	139,{/* 69905 (hide)*/}
1@dth3.gat,66,72,0	script	#talkshow�Ǘ�	139,{/* 69906 */
//setpartyinmap BIOS_1QUE,1;
}
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
1@dth3.gat,70,72,3	script	�攭�����A�o�����`�F#b3	450,{/* 69914 (hide)*/}

1@dth3.gat,69,67,0	script	freeze#bios3	139,{/* 69916 (hide)*/}
