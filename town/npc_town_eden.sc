//====================================================================
// Ragnarok Online - Eden Group Script	by refis
//====================================================================
prontera.gat,122,52,3	script	�y���c��Ԉړ���#1	729,{
	mes "[�y���c��Ԉړ���]";
	mes "���̐��E�̑S�Ă�";
	mes "���߂Ă̌o���ł��邠�Ȃ��I";
	mes "����A�����ɗ��Ă݂Ă��������I";
	mes "���̖����Y�o��!!";
	mes "^ff0000�y���c^000000�̓o��ł��I";
	next;
	mes "[�y���c��Ԉړ���]";
	mes "���݁A�����ғ��Ɍ�����";
	mes "�b��I�[�v�����ł��B";
	mes "�����ғ����͍��ނ��Ƃ�";
	mes "�\�z����܂��̂ŋ����������";
	mes "������^ff0000�y���c^000000��";
	mes "���z�����������I";
	next;
	if(select("�y���c�ɍs������","��b����߂�") == 2) {
		mes "[�y���c��Ԉړ���]";
		mes "���ł����Ȃ��̂��Q���A";
		mes "���҂����Ă��܂��I";
		close;
	}
	mes "[�y���c��Ԉړ���]";
	mes "�����A�y���c�ɍs���Ă݂܂��傤�I";
	mes "������ρ[�I";
	close2;
	warp "moc_para01.gat",31,14;
	end;
OnInit:
	waitingroom "�y���c",0;
	end;
}

moc_para01.gat,27,35,5	script	�����S�����C��#eden	952,{
	cutin "laime_evenor01",2;
	if(checkquest(117099) & 0x8 == 0) {
		mes "[���C��]";
		mes "���ƃ��}���X��ǂ����߂�";
		mes "�`���҂�����B";
		mes "���Ȃ��B�̊y����";
		mes "���l�̉������A";
		mes "���炬�̎q��S�ł��Ȃ��B";
		mes "�����A�����ɂ���̂ł��B";
		next;
		cutin "laime_evenor02",2;
		mes "[���C��]";
		mes "�͂��߂܂��āB";
		mes "���͊y���c�̎�t�S��";
		mes "^0000FF���C���E�C���F�m��^000000�Ɛ\���܂��B";
		mes "�C�y�Ƀ��C���Ƃ��Ăщ������B";
		mes "^FF0000�o�^��^000000���������łȂ��悤�Ȃ̂�";
		mes "�y���c�ɂ��Đ������܂��ˁB";
		next;
		cutin "laime_evenor03",2;
		mes "[���C��]";
		mes "�y���c�ł́A";
		mes "�~�b�h�K���h���̍����Ă���l�B��";
		mes "������ړI�ō��ꂽ�@�ւł���A";
		mes "�ނ�̋�����Ȃǂ�";
		mes "��������Ɩ����s���\��ł��B";
		next;
		mes "[���C��]";
		mes "�\��ƌ������ʂ�A";
		mes "�܂������i�K�̏�ԂȂ�ł��B";
		mes "�Ƃ����̂��A�S������l�Ԃ�";
		mes "�܂�����Ȃ���ԂŁc�c";
		next;
		mes "[���C��]";
		mes "�Ƃ͂������ꂩ�瑱�X��";
		mes "�l�𑝂₵�ĕ֗��ɂȂ�\��ł��B";
		mes "����A����ɂ����҉������B";
		mes "�ȒP�ł��������͈ȏ�ł��B";
		next;
		mes "[���C��]";
		mes "���Ȃ݂Ɋy���c�ւ̓o�^��";
		mes "�ȒP�ȓo�^�葱�����ς܂��΁A";
		mes "�N�ł��y���c�̃����o�[�ɂȂ�܂��B";
		mes "�y���c�ɓ����܂����H";
		next;
		if(select("�͂�","������") == 2) {
			cutin "laime_evenor04",2;
			mes "[���C��]";
			mes "�ӂށc�c�c�O�ł��B";
			mes "�����C���ς��܂�����";
			mes "�܂��A���������Ă��������B";
			close2;
			cutin "laime_evenor04",255;
			end;
		}
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "������܂����B";
		mes "���������]�ł��ˁB";
		mes "�ł͂�����ɖ��O�������Ă��������B";
		next;
		mes "-�����o���ꂽ�p���ɖ��O���������]";
		next;
		emotion 21;
		cutin "laime_evenor02",2;
		mes "[���C��]";
		mes "���肪�Ƃ��������܂��B";
		mes "^3131FF" +strcharinfo(0)+ "^000000�l�ł��ˁH";
		mes "�y���c������X�g��";
		mes "���Ȃ��̂����O��o�^�������܂����B";
		mes "����œo�^��Ƃ͊����ł��B";
		mes "�悤�����A�y���c�ցI";
		next;
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "�Ō�ɒ��ӎ����ł���";
		mes "���n�������o�^�؂��Ȃ���";
		mes "�����o�[�F�؂��o���܂���̂�";
		mes "�ēx�A�o�^�葱������ƂȂ�܂��B";
		mes "�������Ȃ��悤�ɋC������";
		mes "�������������B";
		next;
		cutin "laime_evenor04",2;
		mes "[���C��]";
		mes "�����o�^�Ґ����������̂�";
		mes "��l��l�̊��������̂�";
		mes "�s�\�ł�����ˁc�c�B";
		mes "���̓o�^�؂ŁA���ʂ��Ă��܂��B";
		getitem 6219,1;
		setquest 117099;
		compquest 117099;
		next;
		cutin "laime_evenor01",2;
		mes "[���C��]";
		mes "�Ƃ���Łc�c";
		mes "�y���c�ɓo�^���ꂽ�Ȃ琥��A";
		mes "�y���c�����o�[��p�̔���������";
		mes "����̃��[�v�|�[�^���𔲂���";
		mes "�����ɍs���Ă݂Ă��������B";
		next;
		mes "[���C��]";
		mes "�����Ɍ��݂̃����o�[��";
		mes "�W�܂��Ă���͂��ł��B";
		mes "���̕����͂܂����낢��";
		mes "�������ł��̂ŉ�������܂�";
		mes "�����΂炭���҂����������B";
		close2;
		cutin "laime_evenor01",255;
		end;
	}
	if(countitem(6219) < 1) {	// �y���c�̏�
		mes "[���C��]";
		mes "^ff0000�y���c�̏�^000000��";
		mes "�������Ă��܂�����ł����H";
		mes "�Ĕ��s�͂����ɏo���܂����A";
		mes "�������Ĕ��s���܂����H";
		next;
		if(select("�Ĕ��s���Ă��炤","���͂܂�����") == 2) {
			cutin "laime_evenor01",2;
			mes "[���C��]";
			mes "�ו��̐������K�v�ł����H";
			mes "�Ĕ��s����ۂɂ�";
			mes "���������Ă��������B";
			close2;
			cutin "laime_evenor04",255;
			end;
		}
		cutin "laime_evenor04", 2;
		mes "[���C��]";
		mes "�͂��A�V�����o�^�؂ł��B";
		mes "���x�͖������Ȃ��悤";
		mes "�C��t���Ă��������ˁB";
		getitem 6219, 1;
		close2;
		cutin "laime_evenor04",255;
		end;
	}
	mes "[���C��]";
	mes "���ƃ��}���X��ǂ����߂�";
	mes "�`���҂�����B";
	mes "���Ȃ��B�̊y����";
	mes "���l�̉������A";
	mes "���炬�̎q��S�ł��Ȃ��B";
	mes "�����A�����ɂ���̂ł��B";
	next;
	cutin "laime_evenor01",2;
	mes "[���C��]";
	mes "����A" +strcharinfo(0)+ "�l�B";
	mes "�y���c�ɓo�^���ꂽ�Ȃ琥��A";
	mes "�y���c�����o�[��p�̔���������";
	mes "����̃��[�v�|�[�^���𔲂���";
	mes "�����ɍs���Ă݂Ă��������B";
	next;
	mes "[���C��]";
	mes "�����Ɍ��݂̃����o�[��";
	mes "�W�܂��Ă���͂��ł��B";
	mes "���̕����͂܂����낢��";
	mes "�������ł��̂ŉ�������܂�";
	mes "�����΂炭���҂����������B";
	close2;
	cutin "laime_evenor01",255;
	end;
}

moc_para01.gat,30,10,0	warp	#eden_out		1,1,prontera.gat,119,52
moc_para01.gat,48,16,0	warp	#warp_2_2f		1,1,moc_para01.gat,48,164
moc_para01.gat,47,161,0	warp	#warp_2_1f		1,1,moc_para01.gat,47,18
moc_para01.gat,107,12,0	warp	#warp_2_din_2	1,1,moc_para01.gat,47,36
moc_para01.gat,100,27,0	warp	#warp_2_gym		1,1,moc_para01.gat,47,85
moc_para01.gat,49,86,0	warp	#warp_2_pass_1	1,1,moc_para01.gat,103,27

moc_para01.gat,47,38,0	script	#warp_2_pass	45,1,1,{
	if(countitem(6219) < 1) {	// �y���c�̏�
		mes "�]���ɒ��ӏ����������Ă���]";
		mes "�@";
		mes "�]^FF0000���̐�͊y���c�����o�[��p���[����";
		mes "�@�Ȃ��Ă���܂��B";
		mes "�@�y���c�����o�[�̕��Ȃ�";
		mes "�@���ł������p�����܂�^000000�]";
		next;
		mes "�]���̔����J���邽�߂ɂ�";
		mes "�@^FF0000�y���c�ւ̓o�^^000000��";
		mes "�@�K�v�Ȃ悤���c�c�]";
		close;
	}
	warp "moc_para01.gat",106,14;
	end;
}

moc_para01.gat,16,22,7	script	�V�`����#eden	900,{
	mes "[�V�`����]";
	mes "���̓A�h�o�C�U�[�Ƃ���";
	mes "�����ɌĂ΂ꂽ�񂾁B";
	mes "�`���҂̊y���ƂȂ�悤��";
	mes "�{�݂ɂ���ɂ͂ǂ�������";
	mes "�������ƃ��C������";
	mes "���k�������X����B";
	next;
	mes "[�V�`����]";
	mes "���̎���ɂ͂���Ȏ{�݁A";
	mes "���݂��炵�Ȃ���������ˁB";
	mes "�����l����ƍ��̎Ⴂ�`���҂�";
	mes "�b�܂�Ă���ˁB";
	close;
}

moc_para01.gat,20,35,5	script	�����⏕�j�f#eden	814,{
	mes "[�j�f]";
	mes "�����y���c�ɔz�������";
	mes "�܂��Ԃ��Ȃ��Ǝv���Ă����̂ł����A";
	mes "�悭�悭�l���Ă݂��";
	mes "�����z������Ĕ����قǁA";
	mes "�o�߂��Ă����̂ł��ˁc�c�B";
	next;
	mes "[�j�f]";
	mes "�����Ԃ�Y��Ă��܂����A";
	mes "�d���ɒǂ�����X�𑗂��Ă��܂����B";
	mes "�������ȏ�ɐl�肪�S�R�A";
	mes "����Ȃ���Ԃł�����ˁc�c�B";
	next;
	mes "[�j�f]";
	mes "����ȏ�Ԃ��ᐳ���ғ���";
	mes "���ɂȂ邱�Ƃ���";
	mes "�Â��Ȃ肪���ł����ǁA";
	mes "�F����̌��C�Ȏp�����Ă����";
	mes "�撣�낤�Ƃ����C�ɂȂ�̂�";
	mes "�������Ă��܂��B";
	close;
}
