dali02.gat,46,135,5	script	�V�k#dk	846,{/* 51201 */
	mes "[�V�k]";
	mes "�����v���͎��ɋ����͂����c�c�B";
	mes "^ff0000�L���̌���^000000�������Ă�����";
	mes "���̏��Ɏ����Ă��Ȃ����B";
	mes "^ff0000���N�C�G������^000000��";
	mes "���B�����Ă����邼��B";
	close;
OnInit:
	waitingroom "���N�C�G���������B",0; //51201
	end;
}

dali02.gat,43,129,5	script	�߉q��#dk	686,{/* 51199 */
	if(BaseLevel < 110) {
	}
	if(checkquest(114750) & 0x8 == 8) {
		mes "�]��l�̊Z�Őg���ł߂��j��";
		mes "�@����Ȋ�łȂɂ����Ԃ₢�Ă���]";
		next;
		mes "[�߉q��]";
		mes "���̋@�B�����߂āA�����Ă���΁c�c�B";
		mes "�N�����̋@�B�𒼂�����̂������";
		mes "�ǂ��̂����c�c�B";
		next;
		menu "����������",-;
		mes "[�߉q��]";
		mes "�c�c�N�́c�c!?";
		mes "�c�c�B";
		mes "�������A�`���҂��B";
		mes "�܂����Ƃ茾�𕷂����Ƃ�";
		mes "�p���������Ƃ����������";
		mes "���܂����ȁB";
		next;
		mes "�]��قǂ܂ł̗l�q���R�̂悤��";
		mes "�@�j�̊�ɐ��C���h�����B�]";
		next;
		mes "[�߉q��]";
		mes "�p���łɂ�����A";
		mes "�N�͂���^FF0000��ꂽ�����ړ��@^000000��";
		mes "�C�����邱�Ƃ͂ł��Ȃ����낤���H";
		mes "���炭���̋@�B�����A���̋L����";
		mes "�Ăі߂����߂ɕK�v�Ȃ��̂���";
		mes "�v���̂����c�c�B";
		next;
		menu "�L���c�c�H",-;
		mes "[�߉q��]";
		mes "���܂Ȃ��A�{���͎��ȏЉ��";
		mes "����ׂ��Ȃ̂��낤���A";
		mes "����^0000FF�L����������^000000����񂾁B";
		mes "�����̖��O�͂��납�A";
		mes "�ǂ����Ă����ɋ���̂��������g�A";
		mes "�܂������킩��Ȃ��񂾁B";
		next;
		mes "[�߉q��]";
		mes "�����A���̉�ꂽ�����ړ��@��";
		mes "�݂Ă���ƕs�ӂɋ��ɁA";
		mes "�悭�킩��Ȃ��ɂ݂�����񂾁c�c�B";
		mes "�����狰�炭���̎����ړ��@��";
		mes "�����L�����Ȃ��������R��";
		mes "����ɈႢ�Ȃ��Ǝv���ĂˁB";
		next;
		if(select("���ׂĂ݂܂��傤","�@�B�͋��Łc�c") == 2) {
			mes "[�߉q��]";
			mes "�������c�c�d���Ȃ��B";
			mes "�N�����̋@�B�ɂ���";
			mes "�ڂ����l�Ԃ��ʂ邱�Ƃ�";
			mes "�F���Ă������B";
			next;
			mes "[�߉q��]";
			mes "���܂Ȃ������B";
			mes "�b���o���������ł��ǂ������B";
			mes "���肪�Ƃ��B";
			close;
		}
		mes "[�߉q��]";
		mes "���肪�Ƃ��A�������I";
		mes "�ǂ������͂��̎�̂��̂�";
		mes "���炵���c�c�B";
		next;
		mes "^0000FF�]�����ړ��@�̑O�ɁA";
		mes "�@�A�v���V�A��";
		mes "�@���ƁA�����ړ��@���Ⴂ";
		mes "�@�N�����������Ȃ���";
		mes "�@�N�����n�߂��c�c�]^000000";
		next;
		mes "[�߉q��]";
		mes "�������ȌN�́c�c�I";
		mes "�������Ă��Ȃ��H�@����B";
		mes "���Ƃ��Ă����̋@�B���������̂�";
		mes "�N�����Ă��ꂽ���A���B";
		next;
		mes "[�߉q��]";
		mes "������������΂���̌N��";
		mes "���̂悤�Ȃ��Ƃ������̂�";
		mes "�S�ꂵ���̂����c�c�B";
		mes "�������̋@�B���g���b���̊ԁA";
		mes "�ꏏ�ɂ��Ă��炦�Ȃ����낤���H";
		next;
		mes "[�߉q��]";
		mes "�N�����Ȃ���΂��̋@�B��";
		mes "�����Ȃ��B�Ȃ�ΌN�ɂ��΂炭";
		mes "�ꏏ�ɂ��Ă��炢�A���͂Ȃ�ׂ�";
		mes "�����A�����̋L���̎肪�����";
		mes "��ɓ����悤�ɓw�߂�B";
		next;
		mes "[�߉q��]";
		mes "�c�c�ǂ����낤���H";
		mes "����ƋL���̎肪�����";
		mes "�Ȃ肻���Ȃ��̋@�B��";
		mes "�������񂾁c�c�B";
		mes "���̃`�����X���ǂ����Ă�";
		mes "���������Ȃ��񂾁B";
		next;
		if(select("�͂�݂�","�f��") == 2) {
			mes "[�߉q��]";
			mes "�c�c�������ȁA���܂Ȃ��B";
			mes "����ƋL���̎肪���肪";
			mes "���������Ɗ�сA";
			mes "�N�̓s�����l���Ă��Ȃ������B";
			next;
			mes "[�߉q��]";
			mes "���ɂ���N�����邱�Ƃ͕��������B";
			mes "��͉��Ƃ��A���̗͂ŋN������悤";
			mes "���s���낵�Ă݂悤�Ǝv���B";
			mes "�����܂łŁA�\�����B";
			mes "�{���ɂ��肪�Ƃ��B";
			close;
		}
		mes "[�߉q��]";
		mes "�{�����H";
		mes "�N�ɂ͂ǂ�قǊ��ӂ����Ă�";
		mes "����Ȃ��ȁB";
		mes "�{���ɏ������B";
		mes "";
		next;
		mes "[�߉q��]";
		mes "���āA�N�ɂ��������K�v���낤�B";
		mes "���̋@�B���g���������ł�����";
		mes "���ɘb�������Ă���邩�ȁH";
		setquest 114750; //state=1
		compquest 114750;
		close;
	}
	mes "[�߉q��]";
	mes "�N���c�c�B";
	mes "���ɉ����p�Ȃ̂��H";
	next;
	if(select("�����̋��Ԃ��J��","���ł��Ȃ�") == 2) {
		mes "[�߉q��]";
		mes "�������c�c�B";
		mes "�N�����悯���";
		mes "���̋L�������߂�";
		mes "��`�������Ă����Ə�����B";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�߉q��]";
		mes "�c�c���܂Ȃ��B";
		mes "�����ړ��@���܂��s�����";
		mes "���܂蕉�ׂ��������Ȃ��񂾁B";
		next;
		mes "[�߉q��]";
		mes "�C�����͂��肪�������A";
		mes "�����ړ��@�̋N����";
		mes "�p�[�e�B�[�ɏ������Ă���";
		mes "�p�[�e�B�[���[�_�[��";
		mes "���点�Ė���Ă���񂾁B";
		close;
	}
	mes "[�߉q��]";
	mes "���̋L�������߂����߂�";
	mes "���͂��Ă����̂��H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[�߉q��]";
		mes "�������c�c�B";
		mes "���������͂ł��Ȃ�����ȁB";
		mes "����͒��߂�Ƃ��悤�B";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�߉q��]";
		mes "����A�N���o���Ȃ��悤���ȁB";
		mes "�����҂��Ă���B";
		close;
	}
	mdcreate "Cursed Knight";
	mes "[�߉q��]";
	mes "�����ړ��@���N�����������I";
	mes "�����𐮂��āA�܂��Ă��Ă���B";
	close;
OnInit:
	waitingroom "�􂢂̌��m",0; //51199
	end;
}

dali02.gat,40,134,5	script	�����ړ��@	10007,{/* 51200 */
	mes "�]�����ړ��@������]";
	next;
	if(select("����","��߂Ă���") == 2) {
		mes "[�߉q��]";
		mes "�������c�c�d���Ȃ��B";
		close;
	}
	switch(mdenter("Cursed Knight")) {
	case 0:	// �G���[�Ȃ�
		announce "�������A���_���W����[Cursed Knight] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
		donpcevent getmdnpcname("#DK_Control1")+ "::OnStart";
		setquest 1261; //state=1
		setquest 114760; //state=1
		close2;
		//warp "1@spa.gat",42,196;
		end;
	case 1:	// �p�[�e�B�[������
		mes "�]�������A���_���W������";
		mes "�@���������p�[�e�B�[�̃����o�[�̂݁A";
		mes "�@�������A���_���W�����ɓ���܂��]";
		close;
	case 2:	// �_���W�������쐬
		mes "^ff0000�]�����̋��Ԃ���������Ă��܂���B";
		mes "�@�p�[�e�B�[���[�_�[��";
		mes "�@�������邱�Ƃ��ł��܂��]^000000";
		close;
	default:	// ���̑��G���[
		close;
	}
}

1@spa.gat,0,0,0	script	#DK_Control1	-1,{
OnStart:
	if('flag > 0)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("�S��̉��{2�K");
	hideonnpc getmdnpcname("�S��̉��{3�K");
	hideonnpc getmdnpcname("�S��̉��{4�K");
	hideonnpc getmdnpcname("�S��̉��{5�K");
	hideonnpc getmdnpcname("�׍��̉��q#dk3");
	hideonnpc getmdnpcname("�߉q��#dk3");
	hideonnpc getmdnpcname("�����^���^�m�X#dkt");
	hideonnpc getmdnpcname("�􂢂̍���#dk");
	donpcevent getmdnpcname("����#dk")+ "::OnStart";
	end;
}

1@spa.gat,42,201,1	script	�߉q��#dk	686,{/* 68730 */
	mes "�]�����������Ȃ��c�c�B";
	mes "�@�܂�Ŏ����~�܂��Ă���悤��";
	mes "�@�������ɂ��Ȃ��c�c�]";
	close;
OnTalk1:
	unittalk "�߉q�� : ���肪�����K���B�c�c���̖��ɑウ�܂��Ă��K����P������肷�邱�Ƃ�É��ƁA���̌��ɐ����܂��傤�B";
	end;
OnTalk2:
	unittalk "�߉q�� : �c�c��ӂɂ������܂��A�É��B����H�@�Ȃɂ��O�����������悤�ł��ˁB�c�c!?�@���̓����͌��̓����c�c�B";
	end;
OnTalk3:
	unittalk "�߉q�� : �É�!!�@�������N���Ă��邱�Ƃ͎����̖͗l�c�c�����ɋ��Ă͊댯�ł�!!�@�ЂƂ܂��A�������ւ��߂肭������!!";
	end;
OnTalk4:
	unittalk "�߉q�� : ��ӁB�c�c�B�P�̎�����2�K�A�}���˂΁c�c�B�@�ޏ��ɂ������̂��Ƃ�����Ύ��́c�c�B";
	end;
}
1@spa.gat,41,207,4	script	���Â��߂̒j#dkf1	685,{/* 68731 */
	mes "�]�S�g���Â��߂�";
	mes "�@�������̒j��";
	mes "�@�傫�Ȍ�������";
	mes "�@�ڂ̑O�̓�l��";
	mes "�@���₩�Ȗڂ�";
	mes "�@���߂Ă���c�c�]";
	close;
OnTalk1:
	unittalk "��̐� : �ق��c�c����͒������B�A��������A�A�C�c�͐������l�Ԃ̂悤�����B";
	end;
OnTalk2:
	unittalk "���Â��߂̒j : �l�Ԃ��Ɓc�c�H�@�ǂ����Ă����ɐl�Ԃ�����B";
	end;
OnTalk3:
	unittalk "��̐� : �܂��҂āB���̐l�Ԃ̎n���͂��ł��\�Ȃ񂾁B�����ł�K�v���Ȃ��B����Ɂc�c�ϋq�͑����ق��������B";
	end;
OnTalk4:
	unittalk "���Â��߂̒j : �c�c�����������Ƃ炵���B�Ȃ�΁A���O�ɋ����Ă�낤�B���̐��E�͂���j�̋L�����B�䂦�ɂ��O��������Ɋ����邱�Ƃ͏o���Ȃ��B";
	end;
OnTalk5:
	unittalk "���Â��߂̒j : �����ł��̃o�J�Ȓj�̓^�������͂���Ƃ����B�������A���ł��Ȃ��̂͂��̃o�J�Ȓj�ɂ������B";
	end;
OnTalk6:
	unittalk "���Â��߂̒j : �����X�^�[�ǂ��͂��O�Ɋ����邱�Ƃ��o����B���������E����Ȃ��悤�ɂ���񂾂ȁB�N�b�N�b�N�b�N�c�c�B";
	end;
OnTalk7:
	unittalk "��̐� : �l�Ԃ͑��l�̕s�K���D���炵������ȁc�c�B���������Ղ�z�����񂾍��ɂ܂��������Ȃ����B";
	end;
}
1@spa.gat,41,204,5	script	����#dk	965,{/* 68732 */
	stopnpctimer;
	mes "�]��قǂ̋߉q���������̂�";
	mes "�@���������悤�Ƃ����u�ԁc�c�]";
	next;
	mes "[��̐�]";
	mes "�ق��c�c����͒������B";
	mes "�A��������A�A�C�c�͐�����";
	mes "�l�Ԃ̂悤�����B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk1";
	next;
	mes "[���Â��߂̒j]";
	mes "�l�Ԃ��Ɓc�c�H";
	mes "�ǂ����Ă����ɐl�Ԃ�����B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk2";
	next;
	mes "�]����Ȍ��t�Ƌ���";
	mes "�@���������������������ƁA";
	mes "�@�傫�Ȍ���������";
	mes "�@��l�̍��Â��߂̒j��";
	mes "�@����������߂Ă����]";
	cutin "sakray.bmp", 2;
	next;
	cutin "sakray.bmp", 255;
	mes "�]���������̂��낤�B";
	mes "�@���Â��߂̒j�̊�Ɛ���";
	mes "�@���o��������C�������B";
	mes "�@�ǂ����ŉ�����悤��";
	mes "�@�C������c�c�]";
	next;
	mes "[��̐�]";
	mes "�܂��҂āB";
	mes "���̐l�Ԃ̎n���͂��ł�";
	mes "�\�Ȃ񂾁B";
	mes "�����ł�K�v���Ȃ��B";
	mes "����Ɂc�c";
	mes "�ϋq�͑����ق��������B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk3";
	next;
	mes "�]���������ƂɁA���̐���";
	mes "�@^FF0000�ЁX�����C�����U���";
	mes "�@��^000000���畷�����Ă����c�c�]";
	cutin "tartanos.bmp", 3;
	next;
	cutin "tartanos.bmp", 255;
	cutin "sakray.bmp", 2;
	mes "[���Â��߂̒j]";
	mes "�c�c�����������Ƃ炵���B";
	mes "�Ȃ�΁A���O�ɋ����Ă�낤�B";
	mes "���̐��E�͂���j�̋L�����B";
	mes "�䂦�ɂ��O���������";
	mes "�����邱�Ƃ͏o���Ȃ��B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk4";
	next;
	mes "[���Â��߂̒j]";
	mes "�����ł��̃o�J�Ȓj��";
	mes "�^�������͂���Ƃ����B";
	mes "�������A���ł��Ȃ��̂�";
	mes "���̃o�J�Ȓj�ɂ������B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk5";
	next;
	mes "[���Â��߂̒j]";
	mes "�����X�^�[�ǂ��͂��O��";
	mes "�����邱�Ƃ��o����B";
	mes "���������E����Ȃ��悤��";
	mes "����񂾂ȁB";
	mes "�N�b�N�b�N�b�N�c�c�B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk6";
	next;
	cutin "tartanos.bmp", 3;
	mes "[��̐�]";
	mes "�l�Ԃ͑��l�̕s�K��";
	mes "�D���炵������ȁc�c�B";
	mes "���������Ղ�z������";
	mes "���ɂ܂��������Ȃ����B";
	donpcevent getmdnpcname("���Â��߂̒j#dkf1")+ "::OnTalk7";
	next;
	cutin "tartanos.bmp", 255;
	misceffect 454, getmdnpcname("���Â��߂̒j#dkf1"); //68731
	hideonnpc getmdnpcname("���Â��߂̒j#dkf1"); //68731
	mes "�]�����Ēj�̎p���������r�[�A";
	mes "�@�~�܂��Ă�������";
	mes "�@�����o�����悤�Ȋ��o��";
	mes "�@�P��ꂽ�]";
	misceffect 454,"";
	next;
	mes "[����]";
	mes "���Ȃ����䂪���A�e�B�A���P��";
	mes "�����̋߉q���Ƃ��ĔC������B";
	mes "���Ȃ��̑�z�������p�ƒ����S��M���悤�B";
	mes "�P����낵�����ށB";
	unittalk "���� : ���Ȃ����䂪���A�e�B�A���P�̒����̋߉q���Ƃ��ĔC������B���Ȃ��̑�z�������p�ƒ����S��M���悤�B�P����낵�����ށB";
	next;
	mes "[�߉q��]";
	mes "���肪�����K���B";
	mes "�c�c���̖��ɑウ�܂��Ă�";
	mes "�K����P������肷�邱�Ƃ�";
	mes "�É��ƁA���̌��ɐ����܂��傤�B";
	donpcevent getmdnpcname("�߉q��#dk")+ "::OnTalk1";
	next;
	mes "[����]";
	mes "�K���������A���̏��";
	mes "�K��Ă���׍��̉��q��";
	mes "�䂪���Ƃ̉��k���܂Ƃ܂����B";
	mes "���̉��k���܂Ƃ܂�΁A�킪����";
	mes "��������i�����ׂł��낤�B";
	unittalk "���� : �K���������A���̏��K��Ă���׍��̉��q�Ɖ䂪���Ƃ̉��k���܂Ƃ܂����B���̉��k���܂Ƃ܂�΁A�킪���͍�������i�����ׂł��낤�B";
	next;
	mes "[����]";
	mes "�������͂��̉��k��";
	mes "���܂���C�ł͂Ȃ��悤����";
	mes "�����ƕK����A�킩���Ă�������";
	mes "����ł��낤�B";
	mes "�ꍑ�̉����Ƃ��ĂȂ��ׂ�";
	mes "���Ƃ͉����Ƃ������Ƃ��c�c�B";
	unittalk "���� : �������͂��̉��k�ɂ��܂���C�ł͂Ȃ��悤���������ƕK����A�킩���Ă�����������ł��낤�B�ꍑ�̉����Ƃ��ĂȂ��ׂ����Ƃ͉����Ƃ������Ƃ��c�c�B";
	next;
	mes "[�߉q��]";
	mes "�c�c��ӂɂ������܂��A�É��B";
	mes "����H";
	mes "�Ȃɂ��O�����������悤�ł��ˁB";
	mes "�c�c!?�@���̓����͌��̓����c�c�B";
	donpcevent getmdnpcname("�߉q��#dk")+ "::OnTalk2";
	next;
	mes "[����]";
	mes "���̉��́A�����̉��Ȃ̂�!?";
	mes "�ǂ������I�@�Ȃɂ��N�����Ă���̂�!?";
	mes "�N���񍐂�����̂��I";
	unittalk "���� : ���̉��́A�����̉��Ȃ̂�!?�@�ǂ������I�@�Ȃɂ��N�����Ă���̂�!?�@�N���񍐂�����̂��I";
	next;
	mes "[�߉q��]";
	mes "�É�!!";
	mes "�������N���Ă��邱�Ƃ�";
	mes "�����̖͗l�c�c";
	mes "�����ɋ��Ă͊댯�ł�!!";
	mes "�ЂƂ܂��A�������ւ��߂肭������!!";
	donpcevent getmdnpcname("�߉q��#dk")+ "::OnTalk3";
	next;
	mes "�]�������������Â��߂̒j��";
	mes "�@�����Ă��������X�^�[�Ƃ���";
	mes "�@���t���]�����߂���B";
	mes "�@����̑����Ɖ���";
	mes "�@�֌W������̂��낤���c�c�H�]";
	next;
	mes "[����]";
	mes "���̂��Ƃ͐S�z�Ȃ��B";
	mes "����������Ȃ��́A�����c�c";
	mes "�e�B�A���P������Ă���Ă���!!";
	unittalk "���� : ���̂��Ƃ͐S�z�Ȃ��B����������Ȃ��́A�����c�c�e�B�A���P������Ă���Ă���!!";
	next;
	mes "[�߉q��]";
	mes "��ӁB";
	mes "�c�c�B";
	mes "�P�̎�����2�K�A�}���˂΁c�c�B";
	mes "�ޏ��ɂ������̂��Ƃ�����Ύ��́c�c�B";
	donpcevent getmdnpcname("�߉q��#dk")+ "::OnTalk4";
	close2;
	hideonnpc getmdnpcname("����#dk"); //68732
	hideonnpc getmdnpcname("�߉q��#dk"); //68730
	donpcevent getmdnpcname("#DK_NPCTimer1")+ "::OnStart";
	misceffect 904,"";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9, getmdnpcname("����#dk"); //60431
	end;
}

1@spa.gat,1,1,0	script	#DK_NPCTimer1	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "�Ⴂ�j�̐� : �������c�c�B�e�B�A���P�̑��Ŕޏ�����邱�ƁB���ꂾ�������̍K���A���������������B", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer6000:
	announce "�Ⴂ�j�̐� : �������A�ˑR�̃����X�^�[�̏P���B���ꂪ�S�Ă̔ߌ��̎n�܂肾�����c�c�B", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer9000:
	stopnpctimer;
	announce "�]���Ԃ����������悤�Ȋ��o�̌�A�k�ŉ������J���悤�ȉ��������]", 0x9, 0xffff00, 0x190, 20, 0, 0;
	misceffect 35, getmdnpcname("�S��̉��{2�K"); //68734
	hideoffnpc getmdnpcname("�S��̉��{2�K"); //68734
	donpcevent getmdnpcname("�߉q��#dk1")+ "::OnStart";
	end;
}

1@spa.gat,41,217,0	warp	�S��̉��{2�K	2,2,1@spa.gat,114,120 //68734 from_pos=(41, 217)

1@spa.gat,135,125,3	script	�e�B�A���P#dk	640,{/* 68735 */
	mes "�]�������������Ȃ�ł���B";
	mes "�@�ǂ����R���Ɍ�����̂�";
	mes "�@�C�̂������낤���H�]";
	close;
OnTalk1:
	unittalk "�e�B�A���P : ���̏�Ƀ����X�^�[�����荞�񂾂ƁA�������畷���܂����c�c�B����ŁA�����l�͂������Ȃ̂ł��ˁH";
	end;
OnTalk2:
	unittalk "�e�B�A���P : �c�c���ɂƂ��Ĉ��S�ň��S�ȏꏊ�͈��������܂���B����͐̂���A�����ƕς���Ă͂���܂���c�c�B";
	end;
OnTalk3:
	unittalk "�e�B�A���P : �c�c���߂�Ȃ����B�����X�^�[������P���ȂǁA���܂łȂ��������Ƃ��N���������ł���ȗ\�����ʂ����Ȃ��̂ł��c�c�B�Ȃɂ��������Ƃ����������Łc�c�B";
	end;
OnTalk4:
	unittalk "�e�B�A���P : �����X�^�[�����̏���P�������R�͒肩�ł͂���܂���B�����Ă��̂悤�Ȏ��ɁA�M���ɂ��̂悤�Ȃ��Ƃ𕷂��͕̂s�ސT��������Ȃ��̂ł����c�c�B";
	end;
OnTalk5:
	unittalk "�e�B�A���P : �c�c�����������������B���Ȃ��ɂƂ��Ă����́A����m��Ȃ��׍��̓a���ƌ����̌_������킷���Ƃ��]�݂Ȃ̂ł��傤���c�c�B���́c�c�B���̖]�݂͂��Ȃ��Ɓc�c�B";
	end;
}
1@spa.gat,132,122,7	script	�߉q��#dk1	686,{/* 68736 */
	stopnpctimer;
	mes "[�߉q��]";
	mes "�c�c�P�l�A�������łȂɂ��ł��B";
	unittalk "�߉q�� : �c�c�P�l�A�������łȂɂ��ł��B";
	next;
	mes "[�e�B�A���P]";
	mes "���̏�Ƀ����X�^�[�����荞�񂾂ƁA";
	mes "�������畷���܂����c�c�B";
	mes "����ŁA�����l�͂������Ȃ̂ł��ˁH";
	donpcevent getmdnpcname("�e�B�A���P#dk")+ "::OnTalk1";
	next;
	mes "[�߉q��]";
	mes "�����S���������B";
	mes "�É��͖����ł��B";
	mes "�P�l�������ł͂Ȃ�";
	mes "�����������S�ȏꏊ�ɎQ��܂��傤�B";
	mes "���̂܂܂ł�";
	mes "���댯�Ȗڂɂ������c�c�B";
	unittalk "�߉q�� : �����S���������B�É��͖����ł��B�P�l�������ł͂Ȃ������������S�ȏꏊ�ɎQ��܂��傤�B���̂܂܂ł͂��댯�Ȗڂɂ������c�c�B";
	next;
	mes "[�e�B�A���P]";
	mes "�c�c���ɂƂ��Ĉ��S�ň��S�ȏꏊ��";
	mes "���������܂���B";
	mes "����͐̂���A�����ƕς���Ă�";
	mes "����܂���c�c�B";
	donpcevent getmdnpcname("�e�B�A���P#dk")+ "::OnTalk2";
	next;
	mes "[�߉q��]";
	mes "�e�B�A���P�c�c�B";
	unittalk "�߉q�� : �e�B�A���P�c�c�B";
	next;
	mes "�]�e�B�A���P�Ƌ߉q���̊Ԃ�";
	mes "�@��]�֌W�𒴂���";
	mes "�@��C�Ƌ�������������]";
	next;
	mes "[�e�B�A���P]";
	mes "�c�c���߂�Ȃ����B";
	mes "�����X�^�[������P���ȂǁA";
	mes "���܂łȂ��������Ƃ��N����������";
	mes "����ȗ\�����ʂ����Ȃ��̂ł��c�c�B";
	mes "�Ȃɂ��������Ƃ����������Łc�c�B";
	donpcevent getmdnpcname("�e�B�A���P#dk")+ "::OnTalk3";
	next;
	mes "[�߉q��]";
	mes "�P�l�A�s����������̂�";
	mes "�悭�킩��܂��B";
	mes "�ł����P�l�́A����";
	mes "���̍���w�����ė������ł��B";
	mes "�ǂ����C��������������A�׍���";
	mes "���̕��́A�悫�����ɂȂ��Ă��������c�c�B";
	unittalk "�߉q�� : �P�l�A�s����������̂͂悭�킩��܂��B�ł����P�l�́A���ケ�̍���w�����ė������ł��B�ǂ����C��������������A�׍��̂��̕��́A�悫�����ɂȂ��Ă��������c�c�B";
	next;
	mes "[�e�B�A���P]";
	mes "�����X�^�[�����̏���P����";
	mes "���R�͒肩�ł͂���܂���B";
	mes "�����Ă��̂悤�Ȏ��ɁA";
	mes "�M���ɂ��̂悤�Ȃ��Ƃ𕷂��̂�";
	mes "�s�ސT��������Ȃ��̂ł����c�c�B";
	donpcevent getmdnpcname("�e�B�A���P#dk")+ "::OnTalk4";
	next;
	mes "[�e�B�A���P]";
	mes "�c�c�����������������B";
	mes "���Ȃ��ɂƂ��Ă����́A����m��Ȃ�";
	mes "�׍��̓a���ƌ����̌_������킷���Ƃ�";
	mes "�]�݂Ȃ̂ł��傤���c�c�B";
	mes "���́c�c�B";
	mes "���̖]�݂͂��Ȃ��Ɓc�c�B";
	donpcevent getmdnpcname("�e�B�A���P#dk")+ "::OnTalk5";
	next;
	mes "[�߉q��]";
	mes "�c�c�P�l�B";
	mes "��A���́c�c�B";
	unittalk "�߉q�� : �c�c�P�l�B��A���́c�c�B";
	next;
	mes "[�߉q��]";
	mes "!?";
	mes "�������c�c�߂�!!";
	unittalk "�߉q�� : !?�@�������c�c�߂�!!";
	next;
	mes "�]�����Ɛl�X�̋��ѐ���";
	mes "�@�������ɔ����Ă���̂�";
	mes "�@���������I�]";
	next;
	mes "[�߉q��]";
	mes "�P�l�I";
	mes "���S�ȏꏊ�܂ł����肵�܂�!!";
	mes "�c�c�Q��܂��傤�I";
	unittalk "�߉q�� : �P�l�I�@���S�ȏꏊ�܂ł����肵�܂�!!�c�c�Q��܂��傤�I";
	close2;
	hideonnpc getmdnpcname("�߉q��#dk1"); //68736
	hideonnpc getmdnpcname("�e�B�A���P#dk"); //68735
	misceffect 904,""; //self
	donpcevent getmdnpcname("#DK_NPCTimer2")+ "::OnStart";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9, getmdnpcname("�߉q��#dk1"); //60431
	end;
}

1@spa.gat,1,1,0	script	#DK_NPCTimer2	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "�Ⴂ�j�̐� : �����������ȃe�B�A���P�c�c���́c�c���́c�c�B", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer6000:
	announce "�Ⴂ�j�̐� : ��킭�΋M���ƁA�i���̎����߂������������c�c�B", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer9000:
	stopnpctimer;
	hideoffnpc getmdnpcname("�׍��̉��q#dk3"); //68738
	end;
}

1@spa.gat,111,133,5	script	�׍��̉��q#dk3	470,7,7,{/* 68738 (hide)*/
	mes "�]�d���Ă�ꂽ��i������";
	mes "�@���𒅂��j���A�s�C���ȏΊ��";
	mes "�@�����ׂȂ���΂��Ă���]";
	close;
OnTouch:
	mes "[�׍��̉��q]";
	mes "���̋߉q���͎g���������B";
	mes "�Ƃ肠�����ނɂ͍����";
	mes "�����X�^�[�̏P��������";
	mes "��d�҂Ƃ������ł�";
	mes "�S���Ă����������c�c�B";
	mes "�N�N�N�N�N�B";
	unittalk "�׍��̉��q : ���̋߉q���͎g���������B�Ƃ肠�����ނɂ͍���̃����X�^�[�̏P�������̎�d�҂Ƃ������ł��S���Ă����������B�N�N�N�N�N�B";
	close2;
	announce "�]���Ԃ����������悤�Ȋ��o�̌�A�k�ŉ������J���悤�ȉ��������]", 0x9, 0xffff00, 0x190, 20, 0, 0;
	misceffect 35, getmdnpcname("�S��̉��{3�K"); //68739
	hideoffnpc getmdnpcname("�S��̉��{3�K"); //68739
	donpcevent getmdnpcname("����#dk1")+ "::OnStart";
	end;
}
1@spa.gat,117,137,0	warp	�S��̉��{3�K	2,2,1@spa.gat,60,43 //68739 from_pos=(119, 135)

1@spa.gat,28,52,7	script	�R�m�c��#dk	418,{/* 68740 */
	mes "�]�j�͋�a�̐F�𕂂��ׂ��\��ŁA";
	mes "�@�߉q�������߂Ă���c�c�]";
	close;
}
1@spa.gat,25,53,7	script	���m#dk1	413,{/* 68741 */
	mes "�]�j�͋�a�̐F�𕂂��ׂ��\��ŁA";
	mes "�@�߉q�������߂Ă���c�c�]";
	close;
}
1@spa.gat,34,53,1	script	���m#dk2	413,{/* 68742 */
	mes "�]�j�͌˘f���̕\��ŁA";
	mes "�@�߉q�������߂Ă���c�c�]";
	close;
}
1@spa.gat,30,52,7	script	���m#dk3	417,{/* 68743 */
	mes "�]�j�͌˘f���̕\��ŁA";
	mes "�@�߉q�������߂Ă���c�c�]";
	close;
}
1@spa.gat,30,58,5	script	�߉q��#dk2	10018,{/* 68744 */
	mes "�]���ɂ�������ƌq����A";
	mes "�@�g�������Ƃ�Ȃ��悤���]";
	close;
OnTalk1:
	unittalk "�߉q�� : ����ł��I�@�É��I�@���́c�c���͒f���ĕÉ����A���̍��𗠐؂�悤�ȍs�ׂ͂����Ȃ��Ă���܂���I";
	end;
OnTalk2:
	unittalk "�߉q�� : ���A����́c�c�B";
	end;
OnTalk3:
	unittalk "�߉q�� : �e�B�A���P�c�c�B���̎҂̂悤�Ȃ��̂̂��߂Ɂc�c�B";
	end;
}
1@spa.gat,32,54,1	script	����#dk1	965,{/* 68745 */
	stopnpctimer;
	mes "[����]";
	mes "�����Ƀ����X�^�[���Ăъ񂹂��̂�";
	mes "�܂������Ȃ��������Ƃ́c�c�B";
	mes "��ԐM�����Ă������Ȃ���";
	mes "�܂������؂���Ƃ́c�c�ȁB";
	unittalk "���� : �����Ƀ����X�^�[���Ăъ񂹂��̂��܂������Ȃ��������Ƃ́c�c�B��ԐM�����Ă������Ȃ��ɂ܂������؂���Ƃ́c�c�ȁB";
	next;
	mes "[�߉q��]";
	mes "����ł��I�@�É��I";
	mes "���́c�c���͒f����";
	mes "�É����A���̍��𗠐؂�悤��";
	mes "�s�ׂ͂����Ȃ��Ă���܂���I";
	donpcevent getmdnpcname("�߉q��#dk2")+ "::OnTalk1";
	next;
	mes "[����]";
	mes "�������Ȃ���M�������C�����͂���B";
	mes "�������A���̕����R�������R���Ȃ��B";
	mes "����x�A�₨���B";
	mes "���Ȃ��ɁA���̗��R������ł���̂��H";
	unittalk "���� : �������Ȃ���M�������C�����͂���B�������A���̕����R�������R���Ȃ��B����x�A�₨���B���Ȃ��ɁA���̗��R������ł���̂��H";
	next;
	mes "[�߉q��]";
	mes "���A����́c�c�B";
	donpcevent getmdnpcname("�߉q��#dk2")+ "::OnTalk2";
	next;
	mes "[����]";
	mes "���Ȃ��̂���܂ł̓����ɖƂ�";
	mes "���܂ł́A�D���B";
	mes "�䂪�������̂��Ƃ𕷂��Ă���";
	mes "���ɕ�������Ԃ������Ă���B";
	mes "���Ȃ��̖���D�����ƒm���";
	mes "���𗎂Ƃ����˂Ȃ��قǂɁc�c�ȁB";
	unittalk "���� : ���Ȃ��̂���܂ł̓����ɖƂ����܂ł́A�D���B�䂪�������̂��Ƃ𕷂��Ă��珰�ɕ�������Ԃ������Ă���B���Ȃ��̖���D�����ƒm��Ζ��𗎂Ƃ����˂Ȃ��قǂɁc�c�ȁB";
	next;
	mes "[�߉q��]";
	mes "�e�B�A���P�c�c�B";
	mes "���̂悤�Ȃ��̂̂��߂Ɂc�c�B";
	donpcevent getmdnpcname("�߉q��#dk2")+ "::OnTalk3";
	close2;
	hideonnpc getmdnpcname("����#dk1"); //68745
	hideonnpc getmdnpcname("�߉q��#dk2"); //68744
	hideonnpc getmdnpcname("�R�m�c��#dk"); //68740
	hideonnpc getmdnpcname("���m#dk1"); //68741
	hideonnpc getmdnpcname("���m#dk2"); //68742
	hideonnpc getmdnpcname("���m#dk3"); //68743
	hideoffnpc getmdnpcname("�߉q��#dk3"); //68747
	hideoffnpc getmdnpcname("�����^���^�m�X#dkt"); //68748
	donpcevent getmdnpcname("#DK_NPCTimer3")+ "::OnStart";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9, getmdnpcname("����#dk1"); //60431
	end;
}

1@spa.gat,1,1,0	script	#DK_NPCTimer3	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "�s�g�Ȑ� : ���̏ꏊ�ɒ������l�Ԃ������Ǝv���΁c�c�N�b�N�b�N�B�����S�����߉q����A�d��ꂽ�ȁB", 0x9, 0xff0000, 0x190, 16, 0, 0;
	misceffect 885, getmdnpcname("�����^���^�m�X#dkt"); //68748
	misceffect 829, getmdnpcname("�����^���^�m�X#dkt"); //68748
	end;
OnTimer6000:
	unittalk "�߉q�� : �N���c�c�B�N�����Ɍ�肩���Ă���c�c�B���̂��Ƃ͕����Ă����Ă���c�c�B";
	end;
OnTimer9000:
	announce "�s�g�Ȑ� : �ォ�痈���g���ŁA�����Ȃ����A���ȁB��͂��̐����x�z���邽�߂ɐ��܂ꂽ���A�^���^�m�X�B", 0x9, 0xff0000, 0x190, 16, 0, 0;
	end;
OnTimer12000:
	announce "�����^���^�m�X : �����M�l�����̏󋵂���̒E�p���肤�̂ł���΁A��ƌ_�������Ƃ����B������Ζ��̊댯������P�N���܂��A�����邩������ʂ��H", 0x9, 0xff0000, 0x190, 16, 0, 0;
	end;
OnTimer15000:
	unittalk "�߉q�� : �_��H�@�ǂ����āA�����_����c�c�I�@����������̂�!!�@���́A�P�Ɋ댯�������Ă���!!";
	end;
OnTimer18000:
	announce "�����^���^�m�X : ���ʂɂ���������Ă�낤�B�M�l���ׂꂽ����c�c���ꂱ���A���̗׍��̉��q���B", 0x9, 0xff0000, 0x190, 16, 0, 0;
	end;
OnTimer21000:
	unittalk "�߉q�� : �c�c�׍��̉��q�c�c!?�@��͂肠�̎������l�e�́c�c�I�@�c�c�N�b�c�c�I�@���̍������Ȃ���΁c�c!!";
	end;
OnTimer24000:
	announce "�����^���^�m�X : �N�b�N�b�N�b�B�܂��䂪���t���M�����ʂ悤���ȁB�����������łȂ��ẮA�ʔ����Ȃ��B", 0x9, 0xff0000, 0x190, 16, 0, 0;
	end;
OnTimer27000:
	announce "�����^���^�m�X : �ł́A���񂾂����ʂ��B�ʔ����V���[�������Ă�낤�B�c�c�����Ɏ��B������΁A�킩�邾�낤�B", 0x9, 0xff0000, 0x190, 16, 0, 0;
	end;
OnTimer30000:
	announce "�Ⴂ�j�̐� : �����^���^�m�X�Ƃ��琁c�c�B", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer33000:
	announce "�Ⴂ�j�̐� : ��������Ɏ�鎄�̐S�ɂ������͉̂ʂ����ĕP�ւ̑z�����A����Ƃ��c�c�B", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer36000:
	stopnpctimer;
	hideonnpc getmdnpcname("�߉q��#dk3"); //68747
	hideonnpc getmdnpcname("�����^���^�m�X#dkt"); //68748
	hideoffnpc getmdnpcname("�S��̉��{4�K"); //68749
	donpcevent getmdnpcname("�߉q��#dk4")+ "::OnStart";
	announce "�]���Ԃ����������悤�Ȋ��o�̌�A�쓌�ŉ������J���悤�ȉ��������]", 0x9, 0xffff00, 0x190, 20, 0, 0;
	end;
}

1@spa.gat,31,57,5	script	�߉q��#dk3	10018,{/* 68747 (hide)*/}
1@spa.gat,35,56,5	script	�����^���^�m�X#dkt	844,{/* 68748 (hide)*/}
1@spa.gat,54,28,0	warp	�S��̉��{4�K	2,2,1@spa.gat,218,186 //68749 from_pos=(54, 30)

1@spa.gat,201,214,1	script	�����^���^�m�X#dkt1	1205,{/* 68750 */
	end;
OnTalk1:
	unittalk "�����^���^�m�X : �c�c���̌��t�ɉR�͂Ȃ��ȁH�@�M�l�Ɖ�͂��܂��̎����獰���Ƃ��ɂ��A��͋M�l�ɗ͂�^���悤�I�@�M�l�͉�Ɍ��������̂��I";
	end;
OnTalk2:
	unittalk "�����^���^�m�X : �����̕P�N�͂ǂ����S���ɗH����Ă���悤�����B";
	end;
}
1@spa.gat,197,218,5	script	�׍��̉��q#dk	470,{/* 68751 */
	mes "�]�s�K�ȏ΂݂𕂂���";
	mes "�@�߉q�������߂Ă���]";
	close;
OnTalk1:
	unittalk "�׍��̉��q : �����ƒx�������ˁB�N�����܂�ɂ��x�����炤������₢�l�߂Ă����l�̋`���̕��ƉƗ����E�߂錋�ʂɂȂ��Ă��܂�������Ȃ����B";
	end;
OnTalk2:
	unittalk "�׍��̉��q : �������A�l�̖��Ȃ�Ĉ������̂��B�����A�N�����̎�Ɉ����Ă��邻�̌��B���ꂵ�����^���^�m�X�ɔ�ׂ���ˁB�c�c���̍��ɂ��ꂪ����ƒm���Ă���l���ǂꂾ�����̖�����T�����߂����Ƃ��c�c�B";
	end;
OnTalk3:
	unittalk "�׍��̉��q : �N�ɕ������̂��m��Ȃ�����ǌN�̂����Ă��邱�Ƃ͊T�ː������ȁB�����A�l�����Ăł���Ζ���D���Ȃ�Ė�؂Ȃ��Ƃ͔������������񂾂�H";
	end;
OnTalk4:
	unittalk "�׍��̉��q : �������Ƃ��������̕P���߉q���̌N�͂���Ȑl����Ȃ����ċ����Ȃ���i���Ă��邵���B����܂�ɂ����邳�����炠��ꏊ�Ɉ�l�ŗ���Ԃ��Ă�����Ă����B";
	end;
OnTalk5:
	unittalk "�׍��̉��q : �Ȃ���!?�@���ꂵ�����^���^�m�X��I�@���O���d����ׂ���l�͂�������Ȃ����̖l�̂ق������������͂�!!�@�Ȃ����ꂪ�킩��Ȃ�!?";
	end;
OnTalk6:
	unittalk "�׍��̉��q : �҂Ă�!!�@�ǂ����Ėl�𖳎�����!!�@���O�B�����╃��̂悤�ɖl�𖳔\���Ǝv���Ă�񂾂�!?�@�c�c�������낤�B�l�̖{���̎p�������Ă��!!";
	end;
OnTalk7:
	unittalk "�􂢂̍��� : �O�I�I�I�I�c�c�b�I�@���邪�����A���ꂪ�l�̖{���̗�!!�@�������c�c���E���c�c���ׂ�V�������E�̉��ƂȂ��!";
	end;
OnTalk8:
	unittalk "�􂢂̍��� : �ł́A������u���Ă�����!! �M�l�ɂ͕s�v�Ȃ��̂̂͂�!!�@����肻�̖������g���āA���̏��������悤�ȂǍ��X��x�ꂾ!!";
	end;
OnTalk9:
	unittalk "�􂢂̍��� : ���̏��������񂾂�b!!�@�l���������Ăэ���ł�Ƃ���������ɁA�N�ɂ�����ꂽ���Ƃ��Ȃ����̖l���������񂾁c�c���̖l���c�c�B�ڋ��҂��Ă����Ȃ��炳���c�c�H�@�����Ȃ��c�c�����Ȃ���c�c�B";
	end;
}
1@spa.gat,197,218,5	script	�􂢂̍���#dk	2959,{/* 68752 (hide)*/}
1@spa.gat,194,214,5	script	�|�ꂽ����#dk	956,{/* 68753 */
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}
1@spa.gat,211,194,3	script	�|�ꂽ�R�m�c��#dk	887,{/* 68754 */
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}
1@spa.gat,201,198,1	script	�|�ꂽ���m#dk	849,{/* 68755 */
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}
1@spa.gat,197,190,1	script	�|�ꂽ���m#dk1	849,{/* 68756 */
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}
1@spa.gat,191,207,7	script	�|�ꂽ���m#dk2	849,{/* 68757 */
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}
1@spa.gat,206,209,7	script	�|�ꂽ���m#dk3	849,{/* 68758 */
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}
1@spa.gat,189,195,1	script	�|�ꂽ���m#dk4	849,{/* 68759 */
	mes "�]�Ԏ����Ȃ��c�c�B";
	mes "�@�E����ĊԂ��Ȃ��悤���]";
	close;
}
1@spa.gat,199,214,1	script	�߉q��#dk4	686,{/* 68760 */
	stopnpctimer;
	mes "�]�׍��̉��q�Ƌ߉q����";
	mes "�@�b���Ă���̂�������]";
	next;
	mes "[�߉q��]";
	mes "�c�c���Ȃ����䂪��ɉR��`��";
	mes "��������̎����̎�d�҂Ƃ���";
	mes "�d���ďグ���Ƃ����͖̂{���ł����B";
	unittalk "�߉q�� : �c�c���Ȃ����䂪��ɉR��`����������̎����̎�d�҂Ƃ��Ďd���ďグ���Ƃ����͖̂{���ł����B";
	next;
	mes "[�׍��̉��q]";
	mes "�����ƒx�������ˁB";
	mes "�N�����܂�ɂ��x������";
	mes "��������₢�l�߂Ă���";
	mes "�l�̋`���̕��ƉƗ����E�߂錋�ʂ�";
	mes "�Ȃ��Ă��܂�������Ȃ����B";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk1";
	next;
	mes "[�׍��̉��q]";
	mes "�������A�l�̖��Ȃ�Ĉ������̂��B";
	mes "�����A�N�����̎�Ɉ����Ă��邻�̌��B";
	mes "���ꂵ�����^���^�m�X�ɔ�ׂ���ˁB";
	mes "�c�c���̍��ɂ��ꂪ����ƒm���Ă���";
	mes "�l���ǂꂾ�����̖�����";
	mes "�T�����߂����Ƃ��c�c�B";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk2";
	next;
	mes "[�߉q��]";
	mes "���̌�����ɓ���邽�߂�����";
	mes "���Ȃ��͍������x���A�����ׂ�";
	mes "���̏�Ƀ����X�^�[���Ăэ���";
	mes "��炪���E�̖���D���A";
	mes "�e�B�A���P�܂ŁA�댯�Ȗڂ�";
	mes "���킹�悤�Ƃ����̂�!?";
	unittalk "�߉q�� : ���̌�����ɓ���邽�߂����ɂ��Ȃ��͍������x���A�����ׂꂱ�̏�Ƀ����X�^�[���Ăэ��݉�炪���E�̖���D���A�e�B�A���P�܂ŁA�댯�Ȗڂɂ��킹�悤�Ƃ����̂�!?";
	next;
	mes "[�׍��̉��q]";
	mes "�N�ɕ������̂��m��Ȃ������";
	mes "�N�̂����Ă��邱�Ƃ͊T�ː������ȁB";
	mes "�����A�l�����Ăł���Ζ���D���Ȃ��";
	mes "��؂Ȃ��Ƃ͔������������񂾂�H";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk3";
	next;
	mes "[�׍��̉��q]";
	mes "�������Ƃ��������̕P��";
	mes "�߉q���̌N�͂���Ȑl����Ȃ�����";
	mes "�����Ȃ���i���Ă��邵���B";
	mes "����܂�ɂ����邳������";
	mes "����ꏊ�Ɉ�l��";
	mes "����Ԃ��Ă�����Ă����B";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk4";
	next;
	mes "[�߉q��]";
	mes "�c�c�������B";
	mes "����Ŕ[�����������B";
	mes "���O�����ɂ��������Ƃ�";
	mes "�����������悤���ȁA�����^���^�m�X�B";
	mes "���߂āc�c�_�񐬗����B";
	unittalk "�߉q�� : �c�c�������B����Ŕ[�����������B���O�����ɂ��������Ƃ͐����������悤���ȁA�����^���^�m�X�B���߂āc�c�_�񐬗����B";
	next;
	cutin "tartanos.bmp", 3;
	mes "[�����^���^�m�X]";
	mes "�c�c���̌��t�ɉR�͂Ȃ��ȁH";
	mes "�M�l�Ɖ�͂��܂��̎����獰���Ƃ��ɂ��A";
	mes "��͋M�l�ɗ͂�^���悤�I";
	mes "�M�l�͉�Ɍ��������̂��I";
	donpcevent getmdnpcname("�����^���^�m�X#dkt1")+ "::OnTalk1";
	next;
	cutin "tartanos.bmp", 255;
	mes "[�׍��̉��q]";
	mes "�Ȃ���!?";
	mes "���ꂵ�����^���^�m�X��I";
	mes "���O���d����ׂ���l�͂����ł͂Ȃ�";
	mes "���̖l�̂ق������������͂�!!";
	mes "�Ȃ����ꂪ�킩��Ȃ�!?";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk5";
	next;
	mes "[�߉q��]";
	mes "���O�Ɏ��Ԃ�������قǁA�ɂł͂Ȃ��B";
	mes "�c�c���̓e�B�A���P��T���B";
	unittalk "�߉q�� : ���O�Ɏ��Ԃ�������قǁA�ɂł͂Ȃ��B�c�c���̓e�B�A���P��T���B";
	next;
	mes "[�����^���^�m�X]";
	mes "�����̕P�N�͂ǂ����";
	mes "�S���ɗH�����";
	mes "����悤�����B";
	donpcevent getmdnpcname("�����^���^�m�X#dkt1")+ "::OnTalk2";
	next;
	mes "[�׍��̉��q]";
	mes "�҂Ă�!!";
	mes "�ǂ����Ėl�𖳎�����!!";
	mes "���O�B�����╃��̂悤��";
	mes "�l�𖳔\���Ǝv���Ă�񂾂�!?";
	mes "�c�c�������낤�B";
	mes "�l�̖{���̎p�������Ă��!!";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk6";
	next;
	cutin "tartanos.bmp", 255;
	misceffect 276, getmdnpcname("�׍��̉��q#dk"); //68751
	hideonnpc getmdnpcname("�׍��̉��q#dk"); //68751
	hideoffnpc getmdnpcname("�􂢂̍���#dk"); //68752
	mes "[�􂢂̍���]";
	mes "�O�I�I�I�I�c�c�b�I";
	mes "���邪�����A���ꂪ�l��";
	mes "�{���̗�!!";
	mes "�������c�c���E���c�c";
	mes "���ׂ�V�������E�̉��ƂȂ��!";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk7";
	next;
	mes "[�߉q��]";
	mes "�V�������E�̉����Ɓc�c�H";
	mes "�c�c������Ȃ��c�c�B";
	mes "���͂���Ȃ��́A�����͂Ȃ��B";
	mes "���S����B";
	unittalk "�߉q�� : �V�������E�̉����Ɓc�c�H�@�c�c������Ȃ��c�c�B���͂���Ȃ��́A�����͂Ȃ��B���S����B";
	next;
	mes "[�􂢂̍���]";
	mes "�ł́A������u���Ă�����!!";
	mes "�M�l�ɂ͕s�v�Ȃ��̂̂͂�!!";
	mes "����肻�̖������g���āA";
	mes "���̏��������悤�ȂǍ��X";
	mes "��x�ꂾ!!";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk8";
	next;
	mes "[�߉q��]";
	mes "�P�Ɂc�c�ޏ��Ɂc�c";
	mes "���������c�c�b!!";
	unittalk "�߉q�� : �P�Ɂc�c�ޏ��Ɂc�c���������c�c�b!!";
	next;
	mes "[�􂢂̍���]";
	mes "���̏��������񂾂�b!!";
	mes "�l���������Ăэ���ł�Ƃ���";
	mes "������ɁA�N�ɂ�����ꂽ���Ƃ��Ȃ�";
	mes "���̖l���������񂾁c�c���̖l���c�c�B";
	mes "�ڋ��҂��Ă����Ȃ��炳���c�c�H";
	mes "�����Ȃ��c�c�����Ȃ���c�c�B";
	donpcevent getmdnpcname("�׍��̉��q#dk")+ "::OnTalk9";
	next;
	mes "[�߉q��]";
	mes "�c�c����ȓz�Ɂc�c����ȓz�Ɂc�c";
	mes "�P���c�c�������c�c�b!!";
	unittalk "�߉q�� : �c�c����ȓz�Ɂc�c����ȓz�Ɂc�c�P���c�c�������c�c�b!!";
	next;
	mes "[�߉q��]";
	mes "���̏������p�����̑O��";
	mes "�N���ȁA������c�c�I";
	unittalk "�߉q�� : ���̏������p�����̑O�ɎN���ȁA������c�c�I";
	next;
	mes "�]�߉q�����׍��̉��q��";
	mes "�@�ꑾ�����т����";
	mes "�@�׍��̉��q�͐Ռ`���Ȃ�";
	mes "�@���ł��Ă��܂����]";
	misceffect 565, getmdnpcname("�􂢂̍���#dk"); //68752
	hideonnpc getmdnpcname("�􂢂̍���#dk"); //68752
	close2;
	hideonnpc getmdnpcname("�߉q��#dk4"); //68760
	hideonnpc getmdnpcname("�����^���^�m�X#dkt1"); //68750
	hideonnpc getmdnpcname("�|�ꂽ����#dk"); //68753
	hideonnpc getmdnpcname("�|�ꂽ�R�m�c��#dk"); //68754
	hideonnpc getmdnpcname("�|�ꂽ���m#dk"); //68755
	hideonnpc getmdnpcname("�|�ꂽ���m#dk1"); //68756
	hideonnpc getmdnpcname("�|�ꂽ���m#dk2"); //68757
	hideonnpc getmdnpcname("�|�ꂽ���m#dk3"); //68758
	hideonnpc getmdnpcname("�|�ꂽ���m#dk4"); //68759
	donpcevent getmdnpcname("#DK_NPCTimer4")+ "::OnStart";
	end;
OnStart:
OnTimer3000:
	initnpctimer;
	emotion 9, getmdnpcname("�߉q��#dk4"); //60431
	end;
}

1@spa.gat,1,1,0	script	#DK_NPCTimer4	139,{
OnStart:
	initnpctimer;
	end;
OnTimer3000:
	announce "�Ⴂ�j�̐� : �����Ɨ͂�����΁A������������҂��Ă����̂��낤���c�c�B", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer6000:
	announce "�Ⴂ�j�̐� : ���͎c���ȉ^�����A���s�s�Ȑ��E���A�����Ė��͂ȌȂ�����Ă����B", 0x9, 0x7cfc00, 0x190, 20, 0, 0;
	end;
OnTimer9000:
	stopnpctimer;
	hideoffnpc getmdnpcname("�S��̉��{5�K"); //68762
	announce "�]���Ԃ����������悤�Ȋ��o�̌�A�쐼�ŉ������J���悤�ȉ��������]", 0x9, 0xffff00, 0x190, 20, 0, 0;
	end;
}

1@spa.gat,178,186,0	script	�S��̉��{5�K	45,{/* 68762 (hide)*/}
